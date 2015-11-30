package com.corryn.scb.data.persistence.model.localization;

import com.corryn.scb.core.enumeration.Localization;
import com.corryn.scb.data.persistence.model.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "LOCALIZATION")
public class LocalizationEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long locaId = null;
	private Localization locaLocalization = null;
	private String locaKey = null;
	private String locaEntry = null;

	@Id
	@Column(name = "LOCA_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.locaId;
	}

	public void setId(Long id) {
		this.locaId = id;
	}

	@Transient
	public Long getLocaId() {
		return this.locaId;
	}

	public void setLocaId(Long locaId) {
		this.locaId = locaId;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "LOCA_LOCALIZATION")
	public Localization getLocaLocalization() {
		return this.locaLocalization;
	}

	public void setLocaLocalization(Localization locaLocalization) {
		this.locaLocalization = locaLocalization;
	}

	@Column(name = "LOCA_KEY")
	public String getLocaKey() {
		return this.locaKey;
	}

	public void setLocaKey(String locaKey) {
		this.locaKey = locaKey;
	}

	@Column(name = "LOCA_ENTRY")
	public String getLocaEntry() {
		return this.locaEntry;
	}

	public void setLocaEntry(String locaEntry) {
		this.locaEntry = locaEntry;
	}
}
