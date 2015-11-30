/*     */package com.corryn.scb.view.controller;

/*     */
/*     *//*     */import javax.ejb.EJB;
/*     */
import javax.faces.bean.ManagedBean;
/*     */
import javax.faces.bean.ManagedProperty;
/*     */
import javax.faces.bean.RequestScoped;

import com.corryn.scb.application.service.CookieReference;
/*     */
import com.corryn.scb.application.service.CookieService;
import com.corryn.scb.business.authentication.AuthenticationBean;
import com.corryn.scb.data.model.LoginResult;
/*     */
import com.corryn.scb.session.UserAuthentication;
/*     */

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */@RequestScoped
/*     */@ManagedBean(name = "loginController")
/*     */public class LoginController
/*     */extends UIBase
/*     */
{
	/* 28 */private String account = null;
	/* 29 */private String password = null;
	/* 30 */private Boolean remember = null;
	/*     */
	/*     */
	/*     */
	/*     */@EJB
	/*     */AuthenticationBean authenticationManager;
	/*     */
	/*     */
	/*     */
	/*     */@ManagedProperty("#{userAuthentication}")
	/*     */private UserAuthentication userAuthentication;

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */@Override
	public void postConstruct()
	{
	}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */@Override
	public void preRender()
	{
	}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public String doLogin()
	/*     */
	{
		/* 57 */LoginResult result = this.authenticationManager.login(getAccount(), getPassword());
		/* 58 */if(result.isResult())
		/*     */
		{
			/* 60 */getUserAuthentication().authenticateUser(result.getAccount());
			/* 61 */if(this.remember.booleanValue())
			/*     */
			{
				/* 63 */CookieService.setCookie(CookieReference.AUTOMATIC_LOGIN,
						result.getAccount().getId().toString(), Integer.MAX_VALUE);
				/*     */}
			/* 65 */return "index?faces-redirect=true";
			/*     */}
		/* 67 */return "";
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public String doLogout()
	/*     */
	{
		/* 76 */CookieService.removeCookie(CookieReference.AUTOMATIC_LOGIN);
		/* 77 */this.userAuthentication.remove();
		/* 78 */return "index?faces-redirect=true";
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public UserAuthentication getUserAuthentication()
	/*     */
	{
		/* 86 */return this.userAuthentication;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setUserAuthentication(UserAuthentication userAuthentication)
	/*     */
	{
		/* 94 */this.userAuthentication = userAuthentication;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public String getAccount()
	/*     */
	{
		/* 102 */return this.account;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setAccount(String account)
	/*     */
	{
		/* 110 */this.account = account;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public String getPassword()
	/*     */
	{
		/* 118 */return this.password;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setPassword(String password)
	/*     */
	{
		/* 126 */this.password = password;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public Boolean getRemember()
	/*     */
	{
		/* 134 */return this.remember;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setRemember(Boolean remember)
	/*     */
	{
		/* 142 */this.remember = remember;
		/*     */}
	/*     */
}

/*
 * Location:
 * C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\
 * view\controller\LoginController.class Java compiler version: 7 (51.0) JD-Core
 * Version: 0.7.1
 */