package com.corryn.scb.view.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.corryn.scb.application.service.CookieReference;
import com.corryn.scb.application.service.CookieService;
import com.corryn.scb.business.authentication.AuthenticationBean;
import com.corryn.scb.core.logging.Log;
import com.corryn.scb.data.model.LoginResult;
import com.corryn.scb.session.UserAuthentication;

/**
 * InitController.
 *
 * @author GH29142
 *
 */
@SessionScoped
@ManagedBean(name = "initController")
public class InitController extends UIBase
{
	@EJB
	AuthenticationBean authenticationManager;

	@ManagedProperty("#{userAuthentication}")
	private UserAuthentication userAuthentication;

	@Override
	public void postConstruct()
	{
		try
		{
			String user = CookieService.getCookieValue(CookieReference.AUTOMATIC_LOGIN);
			if(user != null)
			{
				LoginResult result = this.authenticationManager.login(Long.valueOf(user));
				if(result.isResult())
				{
					getUserAuthentication().authenticateUser(result.getAccount());
				}
			}
		}
		catch(Exception ex)
		{
			Log.getLog().error(ex);
		}
	}

	@Override
	public void preRender()
	{
		// empty
	}

	/**
	 * @return userAuthentication
	 */
	public UserAuthentication getUserAuthentication()
	{
		return this.userAuthentication;
	}

	/**
	 * @param userAuthentication userAuthentication
	 */
	public void setUserAuthentication(UserAuthentication userAuthentication)
	{
		this.userAuthentication = userAuthentication;
	}
}