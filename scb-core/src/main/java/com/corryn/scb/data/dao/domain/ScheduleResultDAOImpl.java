package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.ScheduleResultEntity;

public class ScheduleResultDAOImpl
  extends BaseDAOImpl<ScheduleResultEntity>
  implements ScheduleResultDAO
{
  public Class<ScheduleResultEntity> getEntityClass()
  {
    return ScheduleResultEntity.class;
  }
}
