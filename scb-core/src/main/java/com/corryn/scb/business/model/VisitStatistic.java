package com.corryn.scb.business.model;

/**
 *
 * @author GH29142
 *
 */
public class VisitStatistic
{
	private int today;
	private int week;
	private int month;
	private int total;

	/**
	 * @return the today
	 */
	public int getToday()
	{
		return today;
	}

	/**
	 * @param today the today to set
	 */
	public void setToday(int today)
	{
		this.today = today;
	}

	/**
	 * @return the week
	 */
	public int getWeek()
	{
		return week;
	}

	/**
	 * @param week the week to set
	 */
	public void setWeek(int week)
	{
		this.week = week;
	}

	/**
	 * @return the month
	 */
	public int getMonth()
	{
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month)
	{
		this.month = month;
	}

	/**
	 * @return the total
	 */
	public int getTotal()
	{
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total)
	{
		this.total = total;
	}
}
