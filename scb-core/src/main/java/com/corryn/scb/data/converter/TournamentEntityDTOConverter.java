package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.TournamentEntity;
import com.corryn.scb.exchange.model.TournamentDTO;

public class TournamentEntityDTOConverter implements
		EntityDTOConverter<TournamentEntity, TournamentDTO> {
	public TournamentEntity toEntity(TournamentDTO dto) {
		TournamentEntity entity = new TournamentEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDate(dto.getDate());
		entity.setInvitation(dto.getInvitation());
		entity.setInvitationName(dto.getInvitationName());
		entity.setClosed(dto.getClosed());
		return entity;
	}

	public TournamentDTO toDTO(TournamentEntity entity) {
		TournamentDTO dto = new TournamentDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDate(entity.getDate());
		dto.setInvitation(entity.getInvitation());
		dto.setInvitationName(entity.getInvitationName());
		dto.setClosed(entity.getClosed());
		return dto;
	}
}
