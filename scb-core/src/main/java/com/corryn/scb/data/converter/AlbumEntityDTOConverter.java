package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.AlbumEntity;
import com.corryn.scb.exchange.model.AlbumDTO;

public class AlbumEntityDTOConverter implements
		EntityDTOConverter<AlbumEntity, AlbumDTO> {
	public AlbumEntity toEntity(AlbumDTO dto) {
		AlbumEntity entity = new AlbumEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	public AlbumDTO toDTO(AlbumEntity entity) {
		AlbumDTO dto = new AlbumDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}
}
