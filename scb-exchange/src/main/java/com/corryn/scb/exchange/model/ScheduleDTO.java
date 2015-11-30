package com.corryn.scb.exchange.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleDTO {
	private Long id;
	private Integer index;
	private Boolean closed;
	private Date date;
	private List<ScheduleResultDTO> result = new ArrayList<ScheduleResultDTO>();

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Boolean getClosed() {
		return this.closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<ScheduleResultDTO> getResult() {
		return this.result;
	}
}
