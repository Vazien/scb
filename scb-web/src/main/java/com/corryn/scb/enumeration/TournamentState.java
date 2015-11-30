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
/*    */ public enum TournamentState
/*    */ {
/* 13 */   OPEN("OPEN"), 
/*    */   
/*    */ 
/* 16 */   CLOSED("CLOSED");
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private final String type;
/*    */   
/*    */ 
/*    */ 
/*    */   private TournamentState(String type)
/*    */   {
/* 27 */     this.type = type;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getType()
/*    */   {
/* 35 */     return this.type;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\enumeration\TournamentState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */