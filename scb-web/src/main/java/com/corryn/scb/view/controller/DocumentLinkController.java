/*    */ package com.corryn.scb.view.controller;
/*    */ 
/*    */ import javax.faces.bean.RequestScoped;
/*    */ import javax.faces.context.ExternalContext;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.inject.Named;
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
/*    */ @Named("doc")
/*    */ public class DocumentLinkController
/*    */   extends UIBase
/*    */ {
/*    */   private static final String DOCUMENT_PATH = "Documentation/";
/*    */   private static final String APPLICATIONNAME = "SCB";
/*    */   
/*    */   public void postConstruct() {}
/*    */   
/*    */   public void preRender() {}
/*    */   
/*    */   public String getDocumentLink(String fileName)
/*    */   {
/* 42 */     String requestPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
/* 43 */     String rootpath = requestPath.substring(0, requestPath.length() - "SCB".length());
/* 44 */     return rootpath + "Documentation/" + fileName;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\controller\DocumentLinkController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */