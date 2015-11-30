package com.corryn.scb.application.exception;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * @author GH29142
 */
public class ApplicationExceptionHandlerFactory extends ExceptionHandlerFactory
{
	private ExceptionHandlerFactory parent;

	/**
	 * @param parent the ExceptionHandlerFactory to set
	 */
	public ApplicationExceptionHandlerFactory(ExceptionHandlerFactory parent)
	{
		this.parent = parent;
	}

	@Override
	public ExceptionHandler getExceptionHandler()
	{
		ExceptionHandler handler = new ApplicationExceptionHandler(this.parent.getExceptionHandler());
		return handler;
	}
}
