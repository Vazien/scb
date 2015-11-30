package com.corryn.scb.data.persistence.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOURNAMENT")
public class TournamentEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Date date;
	private byte[] invitation;
	private String invitationName;
	private Boolean closed;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DATE")
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "INVITATION")
	public byte[] getInvitation() {
		return this.invitation;
	}

	public void setInvitation(byte[] invitation) {
		this.invitation = invitation;
	}

	@Column(name = "CLOSED")
	public Boolean getClosed() {
		return this.closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	@Column(name = "INVITATION_NAME")
	public String getInvitationName() {
		return this.invitationName;
	}

	public void setInvitationName(String invitationName) {
		this.invitationName = invitationName;
	}
}
