/*     */ package com.corryn.scb.view;
/*     */ 
/*     */ import com.corryn.scb.application.service.DialogService;
import com.corryn.scb.business.domain.GalleryManager;
/*     */ import com.corryn.scb.enumeration.Dialog;
/*     */ import com.corryn.scb.exchange.model.AlbumDTO;
/*     */ import com.corryn.scb.exchange.model.AlbumImageDTO;
/*     */ import com.corryn.scb.view.model.UIAlbumImage;

/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;

/*     */ import javax.ejb.EJB;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.SessionScoped;
/*     */ import javax.faces.context.ExternalContext;
/*     */ import javax.faces.context.FacesContext;
/*     */ import javax.inject.Inject;

/*     */ import org.primefaces.event.FileUploadEvent;
/*     */ import org.primefaces.model.UploadedFile;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ManagedBean(name="albumDetailView")
/*     */ @SessionScoped
/*     */ public class AlbumDetailView
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @EJB
/*     */   GalleryManager galleryManager;
/*     */   @Inject
/*     */   private DialogService dialogService;
/*     */   private AlbumDTO album;
/*     */   private List<UIAlbumImage> albumImages;
/*     */   
/*     */   public void init(Long id)
/*     */   {
/*  52 */     initAlbum(this.galleryManager.loadAlbum(id));
/*     */   }
/*     */   
/*     */   public void openUploadGalleryImageDialog()
/*     */   {
/*  57 */     this.dialogService.openDialog(Dialog.UPLOAD_GALLERY_IMAGE_DIALOG);
/*     */   }
/*     */   
/*     */   public void handleFileUpload(FileUploadEvent event)
/*     */   {
/*  62 */     AlbumImageDTO dto = new AlbumImageDTO();
/*  63 */     dto.setName(event.getFile().getFileName());
/*  64 */     dto.setData(event.getFile().getContents());
/*  65 */     dto.setAlbum(getAlbum());
/*     */     
/*  67 */     initAlbum(this.galleryManager.saveAlbumImage(dto));
/*     */     
/*     */ 
/*  70 */     this.dialogService.closeDialog(Dialog.UPLOAD_GALLERY_IMAGE_DIALOG);
/*     */   }
/*     */   
/*     */   public void setAlbum(AlbumDTO dto)
/*     */   {
/*  75 */     this.album = dto;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AlbumDTO getAlbum()
/*     */   {
/*  84 */     return this.album;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void initAlbum(AlbumDTO album)
/*     */   {
/*  93 */     setAlbum(album);
/*  94 */     getAlbumImages().clear();
/*  95 */     for (AlbumImageDTO dto : album.getImages())
/*     */     {
/*  97 */       getAlbumImages().add(new UIAlbumImage(dto));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<UIAlbumImage> getAlbumImages()
/*     */   {
/* 106 */     if (this.albumImages == null)
/*     */     {
/* 108 */       this.albumImages = new ArrayList();
/*     */     }
/* 110 */     return this.albumImages;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAlbumImages(List<UIAlbumImage> albumImages)
/*     */   {
/* 118 */     this.albumImages = albumImages;
/*     */   }
/*     */   
/*     */   public void markAsDefaultImage()
/*     */   {
/* 123 */     String id = (String)FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("image_default_id");
/* 124 */     this.galleryManager.markImageAsDefault(Long.valueOf(id));
/*     */   }
/*     */   
/*     */   public void doAlbumImageDelete(Long id)
/*     */   {
/* 129 */     this.galleryManager.deleteAlbumImage(id);
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\AlbumDetailView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */