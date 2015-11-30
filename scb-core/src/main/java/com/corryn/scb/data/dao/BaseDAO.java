package com.corryn.scb.data.dao;

import com.corryn.scb.data.persistence.model.IdEntity;
import java.util.List;
import java.util.Map;

public abstract interface BaseDAO<T extends IdEntity>
{
  public abstract T findEntity(Long paramLong);
  
  public abstract List<T> findAllEntities();
  
  public abstract T findEntityByAttribute(String paramString, Object paramObject);
  
  public abstract List<T> findEntitiesByAttribute(String paramString, Object paramObject);
  
  public abstract List<T> findEntitiesByAttributes(Map<String, Object> paramMap);
  
  public abstract T save(T paramT);
  
  public abstract T persist(T paramT);
  
  public abstract T merge(T paramT);
  
  public abstract void refresh(T paramT);
  
  public abstract void remove(T paramT);
  
  public abstract Class<T> getEntityClass();
}
