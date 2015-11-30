/*    */ package com.corryn.scb.view;
/*    */
/*    */ import com.corryn.scb.core.logging.Log;
/*    */ import com.corryn.scb.view.controller.UIBase;

/*    */ import java.io.Serializable;

/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.inject.Named;
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @Named
/*    */ @ViewScoped
/*    */ public class ScheduleView
/*    */   extends UIBase
/*    */   implements Serializable
/*    */ {
/* 22 */   private Long leagueId = null;
/*    */
/*    */
/*    */
/*    */   private static final long serialVersionUID = 1L;
/*    */
/*    */
/*    */
/*    */   public void postConstruct() {}
/*    */
/*    */
/*    */
/*    */   public void preRender()
/*    */   {
/* 36 */     Log.getLog().info(this.leagueId);
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */   public Long getLeagueId()
/*    */   {
/* 44 */     return this.leagueId;
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */   public void setLeagueId(Long leagueId)
/*    */   {
/* 52 */     this.leagueId = leagueId;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\ScheduleView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */