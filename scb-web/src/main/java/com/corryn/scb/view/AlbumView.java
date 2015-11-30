/*     */ package com.corryn.scb.view;
/*     */ 
/*     */ import com.corryn.scb.business.domain.GalleryManager;
/*     */ import com.corryn.scb.exchange.model.AlbumDTO;

/*     */ import java.io.Serializable;
/*     */ import java.util.List;

/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.ejb.EJB;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
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
/*     */ @ManagedBean(name="albumView")
/*     */ @ViewScoped
/*     */ public class AlbumView
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @EJB
/*     */   GalleryManager galleryManager;
/*     */   private List<AlbumDTO> albumList;
/*  36 */   private AlbumDTO selectedAlbum = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostConstruct
/*     */   public void init()
/*     */   {
/*  44 */     this.albumList = this.galleryManager.loadAllAlbums();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doCreateAlbum()
/*     */   {
/*  52 */     AlbumDTO dto = new AlbumDTO();
/*  53 */     dto.setName("Neues Album");
/*  54 */     dto = this.galleryManager.saveAlbum(dto);
/*  55 */     this.albumList.add(dto);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doDeleteAlbum(AlbumDTO dto)
/*     */   {
/*  64 */     this.galleryManager.deleteAlbum(dto);
/*  65 */     this.albumList.remove(dto);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doChangeAlbumName()
/*     */   {
/*  73 */     AlbumDTO changed = this.galleryManager.saveAlbum(this.selectedAlbum);
/*  74 */     for (AlbumDTO dto : this.albumList)
/*     */     {
/*  76 */       if (dto.getId().equals(changed.getId()))
/*     */       {
/*  78 */         dto.setName(changed.getName());
/*  79 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<AlbumDTO> getAlbumList()
/*     */   {
/*  90 */     return this.albumList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AlbumDTO getSelectedAlbum()
/*     */   {
/*  99 */     return this.selectedAlbum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSelectedAlbum(AlbumDTO selectedAlbum)
/*     */   {
/* 108 */     this.selectedAlbum = selectedAlbum;
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\AlbumView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */