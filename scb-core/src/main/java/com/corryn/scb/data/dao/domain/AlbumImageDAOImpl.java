package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.AlbumImageEntity;

public class AlbumImageDAOImpl
  extends BaseDAOImpl<AlbumImageEntity>
  implements AlbumImageDAO
{
  public Class<AlbumImageEntity> getEntityClass()
  {
    return AlbumImageEntity.class;
  }
}
