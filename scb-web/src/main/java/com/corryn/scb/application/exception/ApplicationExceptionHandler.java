package com.corryn.scb.application.exception;

import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;
import javax.naming.NamingException;

import com.corryn.scb.application.service.DialogService;
import com.corryn.scb.core.logging.Log;
import com.corryn.scb.core.naming.CDILookupService;

/**
 * ApplicationExceptionHandler.
 *
 * @author GH29142
 *
 */
public class ApplicationExceptionHandler extends ExceptionHandlerWrapper
{
	private ExceptionHandler handler;

	/**
	 * ApplicationExceptionHandler.
	 *
	 * @param handler handler.
	 */
	public ApplicationExceptionHandler(ExceptionHandler handler)
	{
		this.handler = handler;
	}

	@Override
	public void handle() throws FacesException
	{
		Iterator<ExceptionQueuedEvent> iterator = getUnhandledExceptionQueuedEvents().iterator();
		while(iterator.hasNext())
		{
			ExceptionQueuedEvent event = iterator.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
			Throwable exception = context.getException();
			try
			{
				Log.getLog().error(exception);
				FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("exception", exception);
				CDILookupService.lookup(DialogService.class).openDialog("exceptionDlg");
			}
			catch(NamingException ex)
			{
				Log.getLog().error(ex);
			}
			finally
			{
				iterator.remove();
			}
		}
		getWrapped().handle();
	}

	@Override
	public ExceptionHandler getWrapped()
	{
		return this.handler;
	}
}
