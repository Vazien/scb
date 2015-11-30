/*    */ package com.corryn.scb.view.stream;
/*    */ 
/*    */ import com.corryn.scb.business.domain.GalleryManager;
/*    */ import com.corryn.scb.exchange.model.AlbumImageDTO;

/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;

/*    */ import javax.faces.bean.ApplicationScoped;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.ExternalContext;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.faces.event.PhaseId;
/*    */ import javax.inject.Inject;

/*    */ import org.primefaces.model.DefaultStreamedContent;
/*    */ import org.primefaces.model.StreamedContent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ @ApplicationScoped
/*    */ public class GalleryImageStreamer
/*    */ {
/*    */   @Inject
/*    */   private GalleryManager galleryManager;
/*    */   
/*    */   public StreamedContent getImage()
/*    */     throws IOException
/*    */   {
/* 33 */     FacesContext context = FacesContext.getCurrentInstance();
/* 34 */     if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE)
/*    */     {
/* 36 */       return new DefaultStreamedContent();
/*    */     }
/*    */     
/*    */ 
/* 40 */     String id = (String)context.getExternalContext().getRequestParameterMap().get("image_id");
/* 41 */     AlbumImageDTO dto = this.galleryManager.loadAlbumImage(Long.valueOf(id));
/* 42 */     return new DefaultStreamedContent(new ByteArrayInputStream(dto.getData()));
/*    */   }
/*    */   
/*    */   public StreamedContent getDefaultImage()
/*    */     throws IOException
/*    */   {
/* 48 */     FacesContext context = FacesContext.getCurrentInstance();
/* 49 */     if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE)
/*    */     {
/* 51 */       return new DefaultStreamedContent();
/*    */     }
/*    */     
/*    */ 
/* 55 */     String id = (String)context.getExternalContext().getRequestParameterMap().get("default_image_id");
/* 56 */     AlbumImageDTO dto = this.galleryManager.loadDefaultAlbumImage(Long.valueOf(id));
/* 57 */     if (dto == null)
/*    */     {
/* 59 */       return new DefaultStreamedContent();
/*    */     }
/* 61 */     return new DefaultStreamedContent(new ByteArrayInputStream(dto.getData()));
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\stream\GalleryImageStreamer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */