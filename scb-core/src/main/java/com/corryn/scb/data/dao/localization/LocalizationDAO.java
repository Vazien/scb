package com.corryn.scb.data.dao.localization;

import com.corryn.scb.data.dao.BaseDAO;
import com.corryn.scb.data.persistence.model.localization.LocalizationEntity;

public abstract interface LocalizationDAO
  extends BaseDAO<LocalizationEntity>
{
  public interface Property
  {
    public static final String LOCA_ID = "locaId";
    public static final String LOCA_LOCALIZATION = "locaLocalization";
    public static final String LOCA_KEY = "locaKey";
    public static final String LOCA_ENTRY = "locaEntry";
  }
}
