/*    */ package com.corryn.scb.view.controller;
/*    */ 
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.enterprise.event.Observes;
/*    */ import javax.faces.event.PhaseEvent;
/*    */ import org.apache.deltaspike.jsf.api.listener.phase.BeforePhase;
/*    */ import org.apache.deltaspike.jsf.api.listener.phase.JsfPhaseId;
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
/*    */ public abstract class UIBase
/*    */ {
/*    */   @PostConstruct
/*    */   public void init()
/*    */   {
/* 27 */     postConstruct();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void preRender(@Observes @BeforePhase(JsfPhaseId.RENDER_RESPONSE) PhaseEvent event)
/*    */   {
/* 36 */     preRender();
/*    */   }
/*    */   
/*    */   public abstract void postConstruct();
/*    */   
/*    */   public abstract void preRender();
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\controller\UIBase.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */