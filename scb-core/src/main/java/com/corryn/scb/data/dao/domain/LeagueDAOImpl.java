package com.corryn.scb.data.dao.domain;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.LeagueEntity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class LeagueDAOImpl
  extends BaseDAOImpl<LeagueEntity>
  implements LeagueDAO
{
  public List<String> getYearsForType(String leagueType)
  {
    Query query = getHibernateSession().createSQLQuery("select a.year from (select distinct(year) from league inner join leaguetype on league.leaguetype_id=leaguetype.id where leaguetype.name='" + leagueType + "') a order by year desc");
    return query.list();
  }
  
  public LeagueEntity getLeagueForTypeAndYear(String leagueType, String year)
  {
    Criteria criteria = getHibernateSession().createCriteria(LeagueEntity.class);
    criteria.add(Restrictions.eq("year", year));
    criteria.createAlias("leagueType", "leagueType");
    criteria.add(Restrictions.eq("leagueType.name", leagueType));
    return (LeagueEntity)criteria.uniqueResult();
  }
  
  public List<LeagueEntity> getLeagueForType(String leagueType)
  {
    Criteria criteria = getHibernateSession().createCriteria(LeagueEntity.class);
    criteria.createAlias("leagueType", "leagueType");
    criteria.add(Restrictions.eq("leagueType.name", leagueType));
    return criteria.list();
  }
  
  public Class<LeagueEntity> getEntityClass()
  {
    return LeagueEntity.class;
  }
}
