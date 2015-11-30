package com.corryn.scb.data.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEDULERESULT")
public class ScheduleResultEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer points;
	private TeamEntity team;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "POINTS")
	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = TeamEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "TEAM_ID", referencedColumnName = "ID", insertable = true, updatable = true) })
	public TeamEntity getTeam() {
		return this.team;
	}

	public void setTeam(TeamEntity team) {
		this.team = team;
	}
}
