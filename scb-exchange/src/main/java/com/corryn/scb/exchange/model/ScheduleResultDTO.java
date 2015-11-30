package com.corryn.scb.exchange.model;

public class ScheduleResultDTO {
	private Long id;
	private Integer points;
	private TeamDTO team;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public TeamDTO getTeam() {
		return this.team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}
}
