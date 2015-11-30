package com.corryn.scb.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class LeagueResultDTO {
	private List<TeamResultDTO> result = new ArrayList<TeamResultDTO>();

	public List<TeamResultDTO> getResult() {
		return this.result;
	}
}
