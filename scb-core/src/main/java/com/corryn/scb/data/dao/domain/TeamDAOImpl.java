package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.TeamEntity;

public class TeamDAOImpl
  extends BaseDAOImpl<TeamEntity>
  implements TeamDAO
{
  public Class<TeamEntity> getEntityClass()
  {
    return TeamEntity.class;
  }
}
