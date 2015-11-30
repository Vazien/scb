package com.corryn.scb.data.converter;

import com.corryn.scb.data.persistence.model.TeamEntity;
import com.corryn.scb.exchange.model.TeamDTO;

public class TeamEntityDTOConverter implements
		EntityDTOConverter<TeamEntity, TeamDTO> {
	public TeamEntity toEntity(TeamDTO dto) {
		return null;
	}

	public TeamDTO toDTO(TeamEntity entity) {
		TeamDTO dto = new TeamDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}
}
