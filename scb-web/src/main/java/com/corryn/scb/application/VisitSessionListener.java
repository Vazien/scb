package com.corryn.scb.application;

import javax.inject.Inject;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.corryn.scb.business.domain.VisitBean;

/**
 * @author GH29142
 */
public class VisitSessionListener implements HttpSessionListener
{
	@Inject
	private VisitBean visitManager;

	@Override
	public void sessionCreated(HttpSessionEvent se)
	{
		this.visitManager.logVisit(se.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se)
	{
		// empty
	}
}
