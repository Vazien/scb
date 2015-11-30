/**
 * This file is part of the project.
 */
package com.corryn.scb.data.model;

import com.corryn.scb.data.persistence.model.AccountEntity;

/**
 * @author GH29142
 *
 */
public class LoginResult
{
	private AccountEntity account;
	private boolean result;

	/**
	 * Login fail result.
	 * @return LoginResult.
	 */
	public LoginResult fail()
	{
		this.account = null;
		this.result = false;
		return this;
	}

	/**
	 * Login success.
	 * @param account The account.
	 * @return LoginResult.
	 */
	public LoginResult success(final AccountEntity account)
	{
		this.account = account;
		this.result = true;
		return this;
	}

	/**
	 * @return the result
	 */
	public boolean isResult()
	{
		return result;
	}

	/**
	 * @return the account
	 */
	public AccountEntity getAccount()
	{
		return account;
	}
}
