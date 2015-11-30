/*    */package com.corryn.scb.core.logging;

/*    */
/*    */import java.util.Map;
/*    */
import org.jboss.logging.MDC;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */public class Log
/*    */{
	/*    */
	/* 21 */private static final LoggerProxy log = new LoggerProxy(
			org.jboss.logging.Logger.getLogger("com.corryn.scb"));

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static Logger getLog()
	/*    */{
		/* 29 */return log;
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static void addThreadDiagnosticContext(String key, String value)
	/*    */{
		/* 39 */MDC.put(key, value);
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static void clearThreadDiagnosticContext()
	/*    */{
		/* 47 */Map<String, Object> mdcMap = MDC.getMap();
		/* 48 */for (String key : mdcMap.keySet())
		/*    */{
			/* 50 */MDC.remove(key);
			/*    */}
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static Logger changeLogger(Logger newLogger)
	/*    */{
		/* 62 */if ((newLogger instanceof org.jboss.logging.Logger))
		/*    */{
			/* 64 */log.changeLogger((org.jboss.logging.Logger) newLogger);
			/* 65 */return log;
			/*    */}
		/* 67 */throw new IllegalArgumentException(String.format(
				"The validated object is not an instance of %s",
				new Object[] { org.jboss.logging.Logger.class.getName() }));
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static Logger resetLogger()
	/*    */{
		/* 77 */return resetLogger(null);
		/*    */}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */public static Logger resetLogger(String prefix)
	/*    */{
		/* 88 */String useprefix = prefix == null ? "com.corryn.scb" : prefix;
		/* 89 */log.changeLogger(org.jboss.logging.Logger.getLogger(useprefix));
		/* 90 */return log;
		/*    */}
	/*    */
}

/*
 * Location:
 * C:\Users\gh29142\Desktop\SCBCommon-0.0.1.jar!\com\corryn\scb\common\
 * log\Log.class Java compiler version: 7 (51.0) JD-Core Version: 0.7.1
 */