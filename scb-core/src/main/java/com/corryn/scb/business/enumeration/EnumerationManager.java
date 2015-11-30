package com.corryn.scb.business.enumeration;

import java.util.Locale;

import javax.ejb.Local;

import com.corryn.scb.core.enumeration.Localization;

@Local
public abstract interface EnumerationManager
{
  public abstract Localization[] getAllLocalization();

  public abstract Localization getLocalizationForLocale(Locale paramLocale);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\enumeration\EnumerationManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */