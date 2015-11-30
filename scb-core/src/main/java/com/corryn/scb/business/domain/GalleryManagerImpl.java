/*     */ package com.corryn.scb.business.domain;
/*     */
/*     */ import com.corryn.scb.data.converter.AlbumEntityDTOConverter;
/*     */ import com.corryn.scb.data.converter.AlbumImageEntityDTOConverter;
import com.corryn.scb.data.dao.domain.AlbumDAO;
import com.corryn.scb.data.dao.domain.AlbumImageDAO;
/*     */ import com.corryn.scb.data.persistence.model.AlbumEntity;
/*     */ import com.corryn.scb.data.persistence.model.AlbumImageEntity;
/*     */ import com.corryn.scb.exchange.model.AlbumDTO;
/*     */ import com.corryn.scb.exchange.model.AlbumImageDTO;

/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;

/*     */ import javax.ejb.Stateless;
/*     */ import javax.ejb.TransactionAttribute;
/*     */ import javax.ejb.TransactionAttributeType;
/*     */ import javax.ejb.TransactionManagement;
/*     */ import javax.ejb.TransactionManagementType;
/*     */ import javax.inject.Inject;
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ @Stateless
/*     */ @TransactionManagement(TransactionManagementType.CONTAINER)
/*     */ @TransactionAttribute(TransactionAttributeType.REQUIRED)
/*     */ public class GalleryManagerImpl
/*     */   implements GalleryManager
/*     */ {
/*     */   @Inject
/*     */   private AlbumDAO albumDAO;
/*     */   @Inject
/*     */   private AlbumImageDAO albumImageDAO;
/*     */
/*     */   public AlbumDTO saveAlbum(AlbumDTO dto)
/*     */   {
/*  43 */     AlbumEntity entity = new AlbumEntityDTOConverter().toEntity(dto);
/*  44 */     if (entity.getId() == null)
/*     */     {
/*  46 */       this.albumDAO.persist(entity);
/*     */     }
/*     */     else
/*     */     {
/*  50 */       this.albumDAO.merge(entity);
/*     */     }
/*  52 */     return new AlbumEntityDTOConverter().toDTO(entity);
/*     */   }
/*     */
/*     */
/*     */   public AlbumDTO saveAlbumImage(AlbumImageDTO dto)
/*     */   {
/*  58 */     AlbumEntity albumEntity = (AlbumEntity)this.albumDAO.findEntity(dto.getAlbum().getId());
/*  59 */     AlbumImageEntity albumImageEntity = new AlbumImageEntityDTOConverter().toEntity(dto);
/*  60 */     albumImageEntity.setAlbum(albumEntity);
/*  61 */     this.albumImageDAO.persist(albumImageEntity);
/*  62 */     return loadAlbum(albumEntity.getId());
/*     */   }
/*     */
/*     */
/*     */   public void deleteAlbum(AlbumDTO dto)
/*     */   {
/*  68 */     AlbumEntity entity = (AlbumEntity)this.albumDAO.findEntityByAttribute("id", dto.getId());
/*  69 */     this.albumDAO.remove(entity);
/*     */   }
/*     */
/*     */
/*     */   public AlbumDTO loadAlbum(Long id)
/*     */   {
/*  75 */     AlbumEntity entity = (AlbumEntity)this.albumDAO.findEntityByAttribute("id", id);
/*  76 */     AlbumDTO dto = new AlbumEntityDTOConverter().toDTO(entity);
/*  77 */     for (AlbumImageEntity albumImageEntity : entity.getImages())
/*     */     {
/*  79 */       dto.getImages().add(new AlbumImageEntityDTOConverter().toDTO(albumImageEntity, false));
/*     */     }
/*  81 */     return dto;
/*     */   }
/*     */
/*     */
/*     */   public List<AlbumDTO> loadAllAlbums()
/*     */   {
/*  87 */     List<AlbumEntity> albums = this.albumDAO.findAllEntities();
/*  88 */     List<AlbumDTO> albumDTOs = new ArrayList<AlbumDTO>();
/*  89 */     AlbumEntityDTOConverter converter = new AlbumEntityDTOConverter();
/*  90 */     for (AlbumEntity album : albums)
/*     */     {
/*  92 */       albumDTOs.add(converter.toDTO(album));
/*     */     }
/*  94 */     return albumDTOs;
/*     */   }
/*     */
/*     */
/*     */   public AlbumImageDTO loadAlbumImage(Long id)
/*     */   {
/* 100 */     AlbumImageEntity entity = (AlbumImageEntity)this.albumImageDAO.findEntity(id);
/* 101 */     return new AlbumImageEntityDTOConverter().toDTO(entity);
/*     */   }
/*     */
/*     */
/*     */   public void deleteAlbumImage(Long id)
/*     */   {
/* 107 */     AlbumImageEntity entity = (AlbumImageEntity)this.albumImageDAO.findEntityByAttribute("id", id);
/* 108 */     this.albumImageDAO.remove(entity);
/*     */   }
/*     */
/*     */
/*     */   public AlbumImageDTO loadDefaultAlbumImage(Long id)
/*     */   {
/* 114 */     AlbumDTO dto = loadAlbum(id);
/* 115 */     List<AlbumImageDTO> images = dto.getImages();
/* 116 */     for (AlbumImageDTO image : images)
/*     */     {
/*     */
/* 119 */       if ((image.isDefaultImage() != null) && (image.isDefaultImage().booleanValue()))
/*     */       {
/* 121 */         return image;
/*     */       }
/*     */     }
/* 124 */     Iterator<AlbumImageDTO> i$ = images.iterator(); if (i$.hasNext()) { AlbumImageDTO image = (AlbumImageDTO)i$.next();
/*     */
/* 126 */       return image;
/*     */     }
/* 128 */     return null;
/*     */   }
/*     */
/*     */
/*     */   public void markImageAsDefault(Long id)
/*     */   {
/* 134 */     AlbumImageEntity entity = (AlbumImageEntity)this.albumImageDAO.findEntityByAttribute("id", id);
/* 135 */     Set<AlbumImageEntity> images = entity.getAlbum().getImages();
/* 136 */     for (AlbumImageEntity albumImageEntity : images)
/*     */     {
/* 138 */       albumImageEntity.setDefaultImage(Boolean.FALSE);
/* 139 */       this.albumImageDAO.save(albumImageEntity);
/*     */     }
/* 141 */     entity.setDefaultImage(Boolean.TRUE);
/* 142 */     this.albumImageDAO.save(entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\domain\GalleryManagerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */