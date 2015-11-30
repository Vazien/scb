/*    */ package com.corryn.scb.enumeration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum League
/*    */ {
/* 13 */   BAVARIAN("BAVARIAN"), 
/*    */   
/*    */ 
/* 16 */   STATES("STATES");
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private final String league;
/*    */   
/*    */ 
/*    */ 
/*    */   private League(String league)
/*    */   {
/* 27 */     this.league = league;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getLeague()
/*    */   {
/* 35 */     return this.league;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\enumeration\League.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */