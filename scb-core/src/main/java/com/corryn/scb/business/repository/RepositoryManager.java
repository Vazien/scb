package com.corryn.scb.business.repository;

import java.io.File;
import javax.ejb.Local;

@Local
public abstract interface RepositoryManager
{
  public abstract File getFile(Directory paramDirectory, String paramString);
  
  public abstract boolean saveFile(Directory paramDirectory, File paramFile);
  
  public abstract boolean deleteFile(Directory paramDirectory, String paramString);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\repository\RepositoryManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */