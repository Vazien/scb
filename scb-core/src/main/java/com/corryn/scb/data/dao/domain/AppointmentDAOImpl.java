package com.corryn.scb.data.dao.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.jboss.logging.Logger;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.AppointmentEntity;

/**
 * AppointmentDAOImpl.
 *
 * @author GH29142
 *
 */
public class AppointmentDAOImpl extends BaseDAOImpl<AppointmentEntity> implements AppointmentDAO
{
	private @Inject Logger log;

	@Override
	public List<AppointmentEntity> findCurrentAppointments()
	{
		try
		{
			Session session = getHibernateSession();
			Criteria criteria = session.createCriteria(AppointmentEntity.class);
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			criteria.add(Restrictions.sqlRestriction(" DATUM >= '" + formatter.format(new Date()) + "'"));
			return criteria.list();
		}
		catch(Exception ex)
		{
			this.log.error(ex);
		}
		return null;
	}

	@Override
	public Class<AppointmentEntity> getEntityClass()
	{
		return AppointmentEntity.class;
	}
}
