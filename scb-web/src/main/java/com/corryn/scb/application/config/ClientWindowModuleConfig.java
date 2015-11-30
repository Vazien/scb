package com.corryn.scb.application.config;

import javax.enterprise.inject.Specializes;

import org.apache.deltaspike.jsf.api.config.JsfModuleConfig;
import org.apache.deltaspike.jsf.spi.scope.window.ClientWindowConfig;

/**
 * @author GH29142
 */
@Specializes
public class ClientWindowModuleConfig extends JsfModuleConfig
{
	private static final long serialVersionUID = 1L;

	@Override
	public ClientWindowConfig.ClientWindowRenderMode getDefaultWindowMode()
	{
		return ClientWindowConfig.ClientWindowRenderMode.NONE;
	}
}
