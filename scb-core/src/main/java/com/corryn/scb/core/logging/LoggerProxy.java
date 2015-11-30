/*     */ package com.corryn.scb.core.logging;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LoggerProxy
/*     */   implements Logger
/*     */ {
/*     */   private org.jboss.logging.Logger logger;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LoggerProxy(org.jboss.logging.Logger logger)
/*     */   {
/*  23 */     this.logger = logger;
/*     */   }
/*     */   
/*     */ 
/*     */   public void debug(Object message, Throwable t)
/*     */   {
/*  29 */     this.logger.debug(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void debug(Object message)
/*     */   {
/*  35 */     this.logger.debug(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void debug(String loggerFqcn, Object message, Throwable t)
/*     */   {
/*  47 */     this.logger.debug(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void error(Object message, Throwable t)
/*     */   {
/*  53 */     this.logger.error(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void error(Object message)
/*     */   {
/*  59 */     this.logger.error(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void error(String loggerFqcn, Object message, Throwable t)
/*     */   {
/*  71 */     this.logger.error(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void fatal(Object message, Throwable t)
/*     */   {
/*  77 */     this.logger.fatal(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void fatal(Object message)
/*     */   {
/*  83 */     this.logger.fatal(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void fatal(String loggerFqcn, Object message, Throwable t)
/*     */   {
/*  95 */     this.logger.fatal(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void info(Object message, Throwable t)
/*     */   {
/* 101 */     this.logger.info(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void info(Object message)
/*     */   {
/* 107 */     this.logger.info(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void info(String loggerFqcn, Object message, Throwable t)
/*     */   {
/* 119 */     this.logger.info(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void trace(Object message, Throwable t)
/*     */   {
/* 130 */     this.logger.trace(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void trace(Object message)
/*     */   {
/* 141 */     this.logger.trace(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void trace(String loggerFqcn, Object message, Throwable t)
/*     */   {
/* 153 */     this.logger.trace(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void warn(Object message, Throwable t)
/*     */   {
/* 159 */     this.logger.warn(message, t);
/*     */   }
/*     */   
/*     */ 
/*     */   public void warn(Object message)
/*     */   {
/* 165 */     this.logger.warn(message);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void warn(String loggerFqcn, Object message, Throwable t)
/*     */   {
/* 177 */     this.logger.warn(loggerFqcn, message, t);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void changeLogger(org.jboss.logging.Logger theLogger)
/*     */   {
/* 187 */     this.logger = theLogger;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean isTraceEnabled()
/*     */   {
/* 193 */     return this.logger.isTraceEnabled();
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean isDebugEnabled()
/*     */   {
/* 199 */     return this.logger.isDebugEnabled();
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCommon-0.0.1.jar!\com\corryn\scb\common\log\LoggerProxy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */