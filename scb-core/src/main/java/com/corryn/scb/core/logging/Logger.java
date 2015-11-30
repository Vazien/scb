package com.corryn.scb.core.logging;

public abstract interface Logger
{
  public abstract void debug(Object paramObject, Throwable paramThrowable);
  
  public abstract void debug(Object paramObject);
  
  public abstract void error(Object paramObject, Throwable paramThrowable);
  
  public abstract void error(Object paramObject);
  
  public abstract void fatal(Object paramObject, Throwable paramThrowable);
  
  public abstract void fatal(Object paramObject);
  
  public abstract void info(Object paramObject, Throwable paramThrowable);
  
  public abstract void info(Object paramObject);
  
  public abstract void warn(Object paramObject, Throwable paramThrowable);
  
  public abstract void warn(Object paramObject);
  
  public abstract boolean isTraceEnabled();
  
  public abstract boolean isDebugEnabled();
  
  public abstract void trace(Object paramObject);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCommon-0.0.1.jar!\com\corryn\scb\common\log\Logger.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */