package com.corryn.scb.application.service;

import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GH29142
 */
public class CookieService
{
	/**
	 * @param cookieReference the cookieReference to set
	 * @param value the value to set
	 * @param expiry the expiry to set
	 */
	public static void setCookie(CookieReference cookieReference, String value, int expiry)
	{
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
		Cookie cookie = getCookie(cookieReference);
		if(cookie != null)
		{
			cookie.setValue(value);
		}
		else
		{
			cookie = new Cookie(cookieReference.getName(), value);
			cookie.setPath(request.getContextPath());
		}
		cookie.setMaxAge(expiry);
		HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
		response.addCookie(cookie);
	}

	/**
	 * @param cookieReference the cookieReference to use
	 * @return the Cookie
	 */
	public static Cookie getCookie(CookieReference cookieReference)
	{
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
		Cookie[] userCookies = request.getCookies();
		if(userCookies != null)
		{
			for(Cookie userCookie : userCookies)
			{
				if(cookieReference.getName().equals(userCookie.getName()))
				{
					return userCookie;
				}
			}
		}
		return null;
	}

	/**
	 * @param cookieReference the cookieReference to use
	 * @return the value of the cookie
	 */
	public static String getCookieValue(CookieReference cookieReference)
	{
		Cookie cookie = getCookie(cookieReference);
		if(cookie == null)
		{
			return null;
		}
		return cookie.getValue();
	}

	/**
	 * @param cookieReference the cookieReference to remove.
	 */
	public static void removeCookie(CookieReference cookieReference)
	{
		setCookie(cookieReference, "", 0);
	}

	/**
	 * @param cookieReference the cookieReference to check.
	 * @return check result as boolean value.
	 */
	public static boolean isCookieExisting(CookieReference cookieReference)
	{
		Cookie cookie = getCookie(cookieReference);
		if(cookie == null)
		{
			return false;
		}
		return true;
	}
}
