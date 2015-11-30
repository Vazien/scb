package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.TournamentEntity;

public class TournamentDAOImpl
  extends BaseDAOImpl<TournamentEntity>
  implements TournamentDAO
{
  public Class<TournamentEntity> getEntityClass()
  {
    return TournamentEntity.class;
  }
}
