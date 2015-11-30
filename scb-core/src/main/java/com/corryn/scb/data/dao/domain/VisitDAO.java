package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAO;
import com.corryn.scb.data.persistence.model.VisitEntity;

public abstract interface VisitDAO
  extends BaseDAO<VisitEntity>
{
  public abstract int getVisitForToday();
  
  public abstract int getVisitForWeek();
  
  public abstract int getVisitForMonth();
  
  public abstract int getVisitTotally();
}
