package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.LeagueTypeEntity;

public class LeagueTypeDAOImpl
  extends BaseDAOImpl<LeagueTypeEntity>
  implements LeagueTypeDAO
{
  public Class<LeagueTypeEntity> getEntityClass()
  {
    return LeagueTypeEntity.class;
  }
}
