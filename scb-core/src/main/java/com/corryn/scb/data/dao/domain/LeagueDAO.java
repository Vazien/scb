package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAO;
import com.corryn.scb.data.persistence.model.LeagueEntity;

import java.util.List;

public abstract interface LeagueDAO
  extends BaseDAO<LeagueEntity>
{
  public abstract List<String> getYearsForType(String paramString);
  
  public abstract LeagueEntity getLeagueForTypeAndYear(String paramString1, String paramString2);
  
  public abstract List<LeagueEntity> getLeagueForType(String paramString);
}
