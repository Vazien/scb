/*    */ package com.corryn.scb.business.repository;
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
/*    */ public enum Directory
/*    */ {
/* 17 */   GALLERY("GALLERY");
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private final String name;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private Directory(String name)
/*    */   {
/* 29 */     this.name = name;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getName()
/*    */   {
/* 38 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\repository\Directory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */