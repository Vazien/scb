package com.corryn.scb.application.service;

/**
 * @author GH29142
 *
 */
public enum CookieReference
{
	/** a29956a1-76d4-11e4-82f8-0800200c9a66 */
	AUTOMATIC_LOGIN("a29956a1-76d4-11e4-82f8-0800200c9a66");

	private final String name;

	/**
	 * @param name the name to set.
	 */
	private CookieReference(String name)
	{
		this.name = name;
	}

	/**
	 * @return the name.
	 */
	public String getName()
	{
		return this.name;
	}
}
