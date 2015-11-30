package com.corryn.scb.data.persistence.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LEAGUE")
public class LeagueEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String year;
	private LeagueTypeEntity leagueType;
	private Set<ScheduleEntity> schedule;
	private Set<TeamEntity> teams;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "YEAR")
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = LeagueTypeEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "LEAGUETYPE_ID", referencedColumnName = "ID", insertable = true, updatable = true) })
	public LeagueTypeEntity getLeagueType() {
		return this.leagueType;
	}

	public void setLeagueType(LeagueTypeEntity leagueType) {
		this.leagueType = leagueType;
	}

	@OneToMany(fetch = FetchType.LAZY, targetEntity = ScheduleEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "LEAGUE_ID", referencedColumnName = "ID", insertable = false, updatable = false) })
	public Set<ScheduleEntity> getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Set<ScheduleEntity> schedule) {
		this.schedule = schedule;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "leagueteam", joinColumns = { @javax.persistence.JoinColumn(name = "LEAGUE_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @javax.persistence.JoinColumn(name = "TEAM_ID", nullable = false, updatable = false) })
	public Set<TeamEntity> getTeams() {
		return this.teams;
	}

	public void setTeams(Set<TeamEntity> teams) {
		this.teams = teams;
	}
}
