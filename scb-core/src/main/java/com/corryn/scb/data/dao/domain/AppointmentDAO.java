package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAO;
import com.corryn.scb.data.persistence.model.AppointmentEntity;

import java.util.List;

public abstract interface AppointmentDAO
  extends BaseDAO<AppointmentEntity>
{
  public abstract List<AppointmentEntity> findCurrentAppointments();
}
