package com.corryn.scb.view.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.corryn.scb.business.domain.VisitBean;
import com.corryn.scb.business.model.VisitStatistic;

/**
 *
 * @author GH29142
 *
 */
@ManagedBean
@RequestScoped
public class VisitController extends UIBase
{
	@EJB
	VisitBean visistManager;
	private VisitStatistic statistic;

	@Override
	public void postConstruct()

	{
		this.setStatistic(this.visistManager.getVisitStatistic());
	}

	@Override
	public void preRender()
	{
		// empty
	}

	/**
	 * @return the statistic
	 */
	public VisitStatistic getStatistic()
	{
		return this.statistic;
	}

	/**
	 *
	 * @param statistic the statistic to set
	 */
	public void setStatistic(VisitStatistic statistic)
	{
		this.statistic = statistic;
	}
}