package com.corryn.scb.application.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.primefaces.context.RequestContext;

import com.corryn.scb.enumeration.Dialog;

/**
 * @author GH29142
 */
@ApplicationScoped
public class DialogService implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * @param dialog the dialog to open.
	 */
	public void openDialog(Dialog dialog)
	{
		RequestContext.getCurrentInstance().openDialog(dialog.getPath());
	}

	/**
	 * @param widgetVar the widgetVar to open.
	 */
	public void openDialog(String widgetVar)
	{
		RequestContext.getCurrentInstance().execute("PF('" + widgetVar + "').show()");
	}

	/**
	 * @param dialog the dialog to open as modal window.
	 */
	public void openModalDialog(Dialog dialog)
	{
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", Boolean.valueOf(true));
		RequestContext.getCurrentInstance().openDialog(dialog.getPath(), options, null);
	}

	/**
	 * @param dialog the dialog to close.
	 */
	public void closeDialog(Dialog dialog)
	{
		RequestContext.getCurrentInstance().closeDialog(dialog.getPath());
	}
}