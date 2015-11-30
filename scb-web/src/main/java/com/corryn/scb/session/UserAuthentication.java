package com.corryn.scb.session;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.apache.commons.lang.Validate;
import org.jboss.logging.Logger;

import com.corryn.scb.data.persistence.model.AccountEntity;

/**
 * UserAuthentication.
 *
 * @author GH29142
 *
 */
@SessionScoped
@ManagedBean(name = "userAuthentication")
public class UserAuthentication implements Serializable

{
	private @Inject Logger log;
	private static final long serialVersionUID = 1L;
	private AccountEntity user = null;

	/**
	 * authenticateUser.
	 * @param account the account.
	 */
	public void authenticateUser(AccountEntity account)
	{
		Validate.notNull(account, "account cannot be null");
		this.user = account;
		this.log.info("UserBean: logged in user " + account.getName());
	}

	/**
	 * @return user.getName()
	 */
	public String getUserName()
	{
		return this.user.getName();
	}

	/**
	 * remove
	 */
	public void remove()
	{
		this.user = null;
	}

	/**
	 * isUserLoggedIn
	 * @return boolean
	 */
	public boolean isUserLoggedIn()
	{
		if(this.user == null)

		{
			return false;
		}
		return true;
	}
}
