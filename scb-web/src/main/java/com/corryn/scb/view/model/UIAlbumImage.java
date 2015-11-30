/*    */ package com.corryn.scb.view.model;
/*    */ 
/*    */ import com.corryn.scb.exchange.model.AlbumImageDTO;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIAlbumImage
/*    */ {
/*    */   private AlbumImageDTO albumImageDTO;
/*    */   
/*    */   public UIAlbumImage(AlbumImageDTO dto)
/*    */   {
/* 18 */     setAlbumImageDTO(dto);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public AlbumImageDTO getAlbumImageDTO()
/*    */   {
/* 26 */     return this.albumImageDTO;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setAlbumImageDTO(AlbumImageDTO albumImageDTO)
/*    */   {
/* 34 */     this.albumImageDTO = albumImageDTO;
/*    */   }
/*    */   
/*    */   public String getShrinkedName()
/*    */   {
/* 39 */     if (this.albumImageDTO.getName().length() > 20)
/*    */     {
/* 41 */       return this.albumImageDTO.getName().substring(0, 20);
/*    */     }
/* 43 */     return this.albumImageDTO.getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\model\UIAlbumImage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */