package com.corryn.scb.business.domain;

import com.corryn.scb.exchange.model.AlbumDTO;
import com.corryn.scb.exchange.model.AlbumImageDTO;
import java.util.List;
import javax.ejb.Local;

@Local
public abstract interface GalleryManager
{
  public abstract AlbumDTO saveAlbum(AlbumDTO paramAlbumDTO);
  
  public abstract AlbumDTO saveAlbumImage(AlbumImageDTO paramAlbumImageDTO);
  
  public abstract void deleteAlbum(AlbumDTO paramAlbumDTO);
  
  public abstract AlbumDTO loadAlbum(Long paramLong);
  
  public abstract List<AlbumDTO> loadAllAlbums();
  
  public abstract AlbumImageDTO loadAlbumImage(Long paramLong);
  
  public abstract void deleteAlbumImage(Long paramLong);
  
  public abstract AlbumImageDTO loadDefaultAlbumImage(Long paramLong);
  
  public abstract void markImageAsDefault(Long paramLong);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\domain\GalleryManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */