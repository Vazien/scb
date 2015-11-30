package com.corryn.scb.exchange.model;

public class TeamResultDTO {
	private Integer ranking;
	private TeamDTO team;
	private Integer previousSchedules;
	private Integer lastSchedule;
	private Integer summary;

	public Integer getRanking() {
		return this.ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public TeamDTO getTeam() {
		return this.team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}

	public Integer getPreviousSchedules() {
		return this.previousSchedules;
	}

	public void setPreviousSchedules(Integer previousSchedules) {
		this.previousSchedules = previousSchedules;
	}

	public Integer getLastSchedule() {
		return this.lastSchedule;
	}

	public void setLastSchedule(Integer lastSchedule) {
		this.lastSchedule = lastSchedule;
	}

	public Integer getSummary() {
		return this.summary;
	}

	public void setSummary(Integer summary) {
		this.summary = summary;
	}
}
