package com.corryn.scb.data.persistence.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEDULE")
public class ScheduleEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer index;
	private Boolean closed;
	private Date date;
	private Set<ScheduleResultEntity> result;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "INDEX")
	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Column(name = "CLOSED")
	public Boolean getClosed() {
		return this.closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	@Column(name = "DATE")
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, targetEntity = ScheduleResultEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "SCHEDULE_ID", referencedColumnName = "ID", insertable = false, updatable = false) })
	public Set<ScheduleResultEntity> getResult() {
		return this.result;
	}

	public void setResult(Set<ScheduleResultEntity> result) {
		this.result = result;
	}
}
