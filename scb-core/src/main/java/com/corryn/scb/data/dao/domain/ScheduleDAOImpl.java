package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.ScheduleEntity;

public class ScheduleDAOImpl
  extends BaseDAOImpl<ScheduleEntity>
  implements ScheduleDAO
{
  public Class<ScheduleEntity> getEntityClass()
  {
    return ScheduleEntity.class;
  }
}
