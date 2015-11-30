/*    */ package com.corryn.scb.core.io;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Collection;
/*    */ import org.apache.commons.io.FileUtils;
/*    */ import org.apache.commons.io.filefilter.DirectoryFileFilter;
/*    */ import org.apache.commons.io.filefilter.RegexFileFilter;
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
/*    */ public class Files
/*    */ {
/*    */   public static Collection<File> getAllFilesFromDirectory(String dir)
/*    */   {
/* 30 */     return FileUtils.listFiles(new File(dir), new RegexFileFilter("^(.*?)"), DirectoryFileFilter.DIRECTORY);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static Collection<File> getAllFilesFromDirectory(String dir, String... extensions)
/*    */   {
/* 43 */     return FileUtils.listFiles(new File(dir), extensions, true);
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCommon-0.0.1.jar!\com\corryn\scb\common\io\Files.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */