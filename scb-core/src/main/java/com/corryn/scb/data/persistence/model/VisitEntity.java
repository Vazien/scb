package com.corryn.scb.data.persistence.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VISIT")
public class VisitEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long visiId;
	private String visiSessionId;
	private Date visiDate;

	@Id
	@Column(name = "VISI_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.visiId;
	}

	public void setId(Long id) {
		this.visiId = id;
	}

	@Column(name = "VISI_SESSION_ID")
	public String getVisiSessionId() {
		return this.visiSessionId;
	}

	public void setVisiSessionId(String visiSessionId) {
		this.visiSessionId = visiSessionId;
	}

	@Column(name = "VISI_DATE", insertable = false, updatable = false)
	public Date getVisiDate() {
		return this.visiDate;
	}

	public void setVisiDate(Date visiDate) {
		this.visiDate = visiDate;
	}
}
