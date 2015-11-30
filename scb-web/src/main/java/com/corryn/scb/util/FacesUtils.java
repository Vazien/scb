/*    */ package com.corryn.scb.util;
/*    */
/*    */ import java.util.Map;
/*    */ import javax.faces.context.ExternalContext;
/*    */ import javax.faces.context.FacesContext;
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
/*    */ public class FacesUtils
/*    */ {
/*    */   public static <T> T findSessionBean(String beanName)
/*    */   {
/* 25 */     FacesContext context = FacesContext.getCurrentInstance();
/* 26 */     return (T)context.getExternalContext().getSessionMap().get(beanName);
/*    */   }
/*    */ }