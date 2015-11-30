package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.ScheduleEntity;
import com.corryn.scb.data.persistence.model.ScheduleResultEntity;
import com.corryn.scb.exchange.model.ScheduleDTO;

public class ScheduleEntityDTOConverter implements
		EntityDTOConverter<ScheduleEntity, ScheduleDTO> {
	public ScheduleEntity toEntity(ScheduleDTO dto) {
		return null;
	}

	public ScheduleDTO toDTO(ScheduleEntity entity) {
		ScheduleDTO dto = new ScheduleDTO();
		dto.setId(entity.getId());
		dto.setIndex(entity.getIndex());
		dto.setClosed(entity.getClosed());
		dto.setDate(entity.getDate());
		ScheduleResultEntityDTOConverter converter = new ScheduleResultEntityDTOConverter();
		for (ScheduleResultEntity result : entity.getResult()) {
			dto.getResult().add(converter.toDTO(result));
		}
		return dto;
	}
}
