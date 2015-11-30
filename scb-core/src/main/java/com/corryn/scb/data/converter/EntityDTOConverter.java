package com.corryn.scb.data.converter;

public abstract interface EntityDTOConverter<E, DTO> {
	public abstract E toEntity(DTO paramDTO);

	public abstract DTO toDTO(E paramE);
}
