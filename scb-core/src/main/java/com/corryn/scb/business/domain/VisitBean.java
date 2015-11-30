package com.corryn.scb.business.domain;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import com.corryn.scb.business.model.VisitStatistic;
import com.corryn.scb.data.dao.domain.VisitDAO;
import com.corryn.scb.data.persistence.model.VisitEntity;

/**
 *
 * @author GH29142
 *
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class VisitBean
{
	@Inject
	private VisitDAO visitDAO;

	/**
	 * log a visit.
	 *
	 * @param sessionId the session id.
	 */
	public void logVisit(String sessionId)
	{
		VisitEntity entity = new VisitEntity();
		entity.setVisiSessionId(sessionId);
		this.visitDAO.save(entity);
	}

	/**
	 * get the visit statistic.
	 * @return VisitStatisticDTO
	 */
	public VisitStatistic getVisitStatistic()
	{
		VisitStatistic visitStatistic = new VisitStatistic();
		visitStatistic.setToday(this.visitDAO.getVisitForToday());
		visitStatistic.setWeek(this.visitDAO.getVisitForWeek());
		visitStatistic.setMonth(this.visitDAO.getVisitForMonth());
		visitStatistic.setTotal(this.visitDAO.getVisitTotally());
		return visitStatistic;
	}
}
