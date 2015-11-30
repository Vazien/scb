package com.corryn.scb.data.dao.localization;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.localization.LocalizationEntity;

public class LocalizationDAOImpl
  extends BaseDAOImpl<LocalizationEntity>
  implements LocalizationDAO
{
  public Class<LocalizationEntity> getEntityClass()
  {
    return LocalizationEntity.class;
  }
}
