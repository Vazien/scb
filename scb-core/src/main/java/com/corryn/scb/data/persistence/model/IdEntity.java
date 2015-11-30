package com.corryn.scb.data.persistence.model;

import java.io.Serializable;

public abstract interface IdEntity extends Serializable {
	public abstract Long getId();

	public abstract void setId(Long paramLong);
}
