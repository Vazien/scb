package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.LeagueEntity;
import com.corryn.scb.data.persistence.model.ScheduleEntity;
import com.corryn.scb.exchange.model.LeagueDTO;

public class LeagueEntityDTOConverter implements
		EntityDTOConverter<LeagueEntity, LeagueDTO> {
	public LeagueEntity toEntity(LeagueDTO dto) {
		LeagueEntity entity = new LeagueEntity();
		return entity;
	}

	public LeagueDTO toDTO(LeagueEntity entity) {
		LeagueDTO dto = new LeagueDTO();
		dto.setId(entity.getId());
		dto.setLeaguetype(entity.getLeagueType().getName());
		dto.setYear(entity.getYear());
		ScheduleEntityDTOConverter scheduleEntityDTOConverter = new ScheduleEntityDTOConverter();
		for (ScheduleEntity scheduleEntity : entity.getSchedule()) {
			dto.getSchedule().add(
					scheduleEntityDTOConverter.toDTO(scheduleEntity));
		}
		return dto;
	}
}
