package com.corryn.scb.business.authentication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.commons.lang.Validate;

import com.corryn.scb.data.dao.authentication.AuthenticationDAO;
import com.corryn.scb.data.model.LoginResult;
import com.corryn.scb.data.persistence.model.AccountEntity;

/**
 * AuthenticationBean.
 *
 * @author GH29142
 *
 */
@Stateless
@LocalBean
public class AuthenticationBean
{
	@Inject
	private AuthenticationDAO authenticationDAO;

	/**
	 * Login
	 *
	 * @param account the account.
	 * @param password the password.
	 *
	 * @return AuthenticatedUserDTO.
	 */
	public LoginResult login(String account, String password)
	{
		Validate.notNull(account, "account cannot be null");
		Validate.notNull(password, "password cannot be null");
		Map<String, Object> login = new HashMap<String, Object>();
		login.put("name", account);
		login.put("passwort", password);
		List<AccountEntity> accounts = this.authenticationDAO.findEntitiesByAttributes(login);
		if((accounts.size() > 1) || (accounts.size() == 0))
		{
			return new LoginResult().fail();
		}
		return new LoginResult().success(accounts.get(0));
	}

	/**
	 * Login.
	 *
	 * @param id the account id.
	 *
	 * @return AuthenticatedUserDTO.
	 */
	public LoginResult login(Long id)
	{
		AccountEntity account = this.authenticationDAO.findEntityByAttribute("id", id);
		return new LoginResult().success(account);
	}
}
