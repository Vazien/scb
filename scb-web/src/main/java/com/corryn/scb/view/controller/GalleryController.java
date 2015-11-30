/*    */ package com.corryn.scb.view.controller;
/*    */
/*    */ import com.corryn.scb.core.logging.Log;
/*    */ import com.corryn.scb.exchange.model.AlbumDTO;
/*    */ import com.corryn.scb.view.AlbumDetailView;

/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.RequestScoped;
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
/*    */ @RequestScoped
/*    */ @ManagedBean(name="galleryController")
/*    */ public class GalleryController
/*    */   extends UIBase
/*    */ {
/*    */   @ManagedProperty("#{albumDetailView}")
/*    */   private AlbumDetailView albumDetailView;
/*    */
/*    */   public void postConstruct() {}
/*    */
/*    */   public void preRender() {}
/*    */
/*    */   public String navigateAlbumDetail(AlbumDTO album)
/*    */   {
/* 47 */     Log.getLog().info("Initialize gallery detail for " + album.getName());
/* 48 */     this.albumDetailView.init(album.getId());
/* 49 */     return "galleryDetail?faces-redirect=true";
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */   public AlbumDetailView getAlbumDetailView()
/*    */   {
/* 58 */     return this.albumDetailView;
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */   public void setAlbumDetailView(AlbumDetailView albumDetailView)
/*    */   {
/* 67 */     this.albumDetailView = albumDetailView;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\controller\GalleryController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */