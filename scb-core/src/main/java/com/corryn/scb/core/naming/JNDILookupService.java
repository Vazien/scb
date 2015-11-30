package com.corryn.scb.core.naming;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.corryn.scb.core.logging.Log;

public class JNDILookupService
{

	/*    */public static <T> T lookup(Class<T> forClass)
	/*    */
	{
		/*    */try
		/*    */{
			/* 24 */Log.getLog().info("Invoke JndiLookup for class " + forClass.getName());
			/* 25 */Context ctx = new InitialContext();
			/* 26 */String jndiBeanName = getBeanName(forClass);
			/* 27 */Object instance = ctx.lookup(jndiBeanName);
			/* 28 */if(instance == null)
			/*    */
			{
				/* 30 */Log.getLog().warn("Cannot find instance for JndiResource " + jndiBeanName);
				/* 31 */return null;
				/*    */}
			/* 33 */return (T) instance;
			/*    */}
		/*    */catch(Exception ex)
		/*    */
		{
			/* 37 */Log.getLog().error(ex);
			/*    */}
		/* 39 */return null;
		/*    */}

	/*    */
	/*    */public static Object lookup(String name)
	/*    */
	{
		/*    */try
		/*    */{
			/* 46 */Log.getLog().info("Invoke JndiLookup for name " + name);
			/* 47 */Context ctx = new InitialContext();
			/* 48 */Object instance = ctx.lookup(name);
			/* 49 */if(instance == null)
			/*    */
			{
				/* 51 */Log.getLog().warn("Cannot find instance for JndiResource " + name);
				/* 52 */return null;
				/*    */}
			/* 54 */return instance;
			/*    */}
		/*    */catch(Exception ex)
		/*    */
		{
			/* 58 */Log.getLog().error(ex);
			/*    */}
		/* 60 */return null;
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */private static String getBeanName(Class<?> forClass)
	/*    */
	{
		/* 70 */String implementationName = forClass.getSimpleName() + "Impl";
		/* 71 */return "java:app/SCBWeb/" + implementationName + "!" + forClass.getName();
		/*    */}
	/*    */
}