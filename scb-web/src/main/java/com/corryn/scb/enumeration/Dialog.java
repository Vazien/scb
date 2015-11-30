/*    */ package com.corryn.scb.enumeration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum Dialog
/*    */ {
/* 11 */   UPLOAD_GALLERY_IMAGE_DIALOG("/ui/dialog/uploadGalleryImageDialog");
/*    */   
/*    */   private String path;
/*    */   
/*    */   private Dialog(String path)
/*    */   {
/* 17 */     this.path = path;
/*    */   }
/*    */   
/*    */   public String getPath()
/*    */   {
/* 22 */     return this.path;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\enumeration\Dialog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */