package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.VisitEntity;

import java.math.BigInteger;

import org.hibernate.Query;
import org.hibernate.Session;

public class VisitDAOImpl
  extends BaseDAOImpl<VisitEntity>
  implements VisitDAO
{
  public Class<VisitEntity> getEntityClass()
  {
    return VisitEntity.class;
  }
  
  public int getVisitForToday()
  {
    Query query = getHibernateSession().createSQLQuery("SELECT count(*) FROM visit where DATE(visi_date) = DATE(NOW());");
    BigInteger count = (BigInteger)query.uniqueResult();
    return count.intValue();
  }
  
  public int getVisitForWeek()
  {
    Query query = getHibernateSession().createSQLQuery("SELECT count(*) FROM visit WHERE week(visi_date) = EXTRACT(week FROM (NOW()));");
    BigInteger count = (BigInteger)query.uniqueResult();
    return count.intValue();
  }
  
  public int getVisitForMonth()
  {
    Query query = getHibernateSession().createSQLQuery("SELECT count(*) FROM visit WHERE month(visi_date) = EXTRACT(month FROM (NOW()));");
    BigInteger count = (BigInteger)query.uniqueResult();
    return count.intValue();
  }
  
  public int getVisitTotally()
  {
    Query query = getHibernateSession().createSQLQuery("SELECT count(*) FROM visit;");
    BigInteger count = (BigInteger)query.uniqueResult();
    return count.intValue();
  }
}
