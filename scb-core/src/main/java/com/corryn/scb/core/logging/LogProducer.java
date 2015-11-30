/**
 * This file is part of the HED-KDB project.
 */
package com.corryn.scb.core.logging;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.jboss.logging.Logger;

/**
 * LogProducer.
 *
 * @author gh29142
 *
 */
public class LogProducer
{
	/**
	 * Produce org.jboss.logging.Logger instance for a InjectionPoint.
	 *
	 * @param injectionPoint The injection point to use.
	 * @return Logger instance.
	 */
	@Produces
	public static Logger getLogger(InjectionPoint injectionPoint)
	{
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass());
	}
}
