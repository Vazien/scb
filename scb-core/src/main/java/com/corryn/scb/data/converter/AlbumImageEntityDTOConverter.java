package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.AlbumImageEntity;
import com.corryn.scb.exchange.model.AlbumImageDTO;

public class AlbumImageEntityDTOConverter implements
		EntityDTOConverter<AlbumImageEntity, AlbumImageDTO> {
	public AlbumImageEntity toEntity(AlbumImageDTO dto) {
		AlbumImageEntity entity = new AlbumImageEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setData(dto.getData());
		entity.setDefaultImage(dto.isDefaultImage());
		return entity;
	}

	public AlbumImageDTO toDTO(AlbumImageEntity entity) {
		return toDTO(entity, true);
	}

	public AlbumImageDTO toDTO(AlbumImageEntity entity, boolean loadData) {
		AlbumImageDTO dto = new AlbumImageDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setData(entity.getData());
		dto.setDefaultImage(entity.isDefaultImage());
		return dto;
	}
}
