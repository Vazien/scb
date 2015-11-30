package com.corryn.scb.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class LeagueDTO {
	private Long id = null;
	private String year = null;
	private String leaguetype = null;
	private List<ScheduleDTO> schedule = new ArrayList<ScheduleDTO>();

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLeaguetype() {
		return this.leaguetype;
	}

	public void setLeaguetype(String leaguetype) {
		this.leaguetype = leaguetype;
	}

	public List<ScheduleDTO> getSchedule() {
		return this.schedule;
	}
}
