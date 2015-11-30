package com.corryn.scb.exchange.model;

import java.util.Date;

public class TournamentDTO {
	private Long id = null;
	private String name = null;
	private Date date = null;
	private byte[] invitation = null;
	private String invitationName = null;
	private Boolean closed = Boolean.FALSE;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getInvitation() {
		return this.invitation;
	}

	public void setInvitation(byte[] invitation) {
		this.invitation = invitation;
	}

	public Boolean getClosed() {
		return this.closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public String getInvitationName() {
		return this.invitationName;
	}

	public void setInvitationName(String invitationName) {
		this.invitationName = invitationName;
	}
}
