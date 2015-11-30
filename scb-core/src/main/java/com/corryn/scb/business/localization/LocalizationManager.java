package com.corryn.scb.business.localization;

import com.corryn.scb.core.enumeration.Localization;
import com.corryn.scb.data.persistence.model.localization.LocalizationEntity;

import java.util.List;

import javax.ejb.Local;

@Local
public abstract interface LocalizationManager
{
  public abstract List<LocalizationEntity> getLocalizationEntries(Localization paramLocalization);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\localization\LocalizationManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */