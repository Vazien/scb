package com.corryn.scb.application;

import javax.enterprise.event.Observes;
import javax.faces.event.PhaseEvent;

import org.apache.deltaspike.jsf.api.listener.phase.AfterPhase;
import org.apache.deltaspike.jsf.api.listener.phase.BeforePhase;
import org.apache.deltaspike.jsf.api.listener.phase.JsfPhaseId;

/**
 * @author GH29142
 */
public class LifecycleObserver
{
	/**
	 * @param event the event to set.
	 */
	public void before(@Observes @BeforePhase(JsfPhaseId.ANY_PHASE) PhaseEvent event)
	{
		// empty
	}

	/**
	 * @param event the event to set.
	 */
	public void after(@Observes @AfterPhase(JsfPhaseId.ANY_PHASE) PhaseEvent event)
	{
		// empty
	}
}