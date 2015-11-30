package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.ScheduleResultEntity;
import com.corryn.scb.exchange.model.ScheduleResultDTO;

public class ScheduleResultEntityDTOConverter implements
		EntityDTOConverter<ScheduleResultEntity, ScheduleResultDTO> {
	public ScheduleResultEntity toEntity(ScheduleResultDTO dto) {
		return null;
	}

	public ScheduleResultDTO toDTO(ScheduleResultEntity entity) {
		ScheduleResultDTO dto = new ScheduleResultDTO();
		dto.setId(entity.getId());
		dto.setPoints(entity.getPoints());
		dto.setTeam(new TeamEntityDTOConverter().toDTO(entity.getTeam()));
		return dto;
	}
}
