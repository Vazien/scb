package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.AlbumEntity;

public class AlbumDAOImpl
  extends BaseDAOImpl<AlbumEntity>
  implements AlbumDAO
{
  public Class<AlbumEntity> getEntityClass()
  {
    return AlbumEntity.class;
  }
}
