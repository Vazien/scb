/*    */ package com.corryn.scb.view.controller;
/*    */
/*    */ import com.corryn.scb.core.logging.Log;
/*    */ import com.corryn.scb.enumeration.League;
/*    */ import com.corryn.scb.view.LeagueView;

/*    */ import java.io.Serializable;

/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */
/*    */
/*    */
/*    */
/*    */ @ManagedBean(name="leagueController")
/*    */ @ViewScoped
/*    */ public class LeagueController
/*    */   extends UIBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @ManagedProperty("#{leagueView}")
/*    */   private LeagueView leagueView;
/*    */
/*    */   public void postConstruct() {}
/*    */
/*    */   public void preRender() {}
/*    */
/*    */   public String doOpen(String type)
/*    */   {
/* 52 */     Log.getLog().info("Initialize the league page for " + type);
/* 53 */     getLeagueView().init(League.valueOf(type));
/* 54 */     return "league?faces-redirect=true";
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */   public LeagueView getLeagueView()
/*    */   {
/* 62 */     return this.leagueView;
/*    */   }
/*    */
/*    */
/*    */
/*    */
/*    */   public void setLeagueView(LeagueView leagueView)
/*    */   {
/* 70 */     this.leagueView = leagueView;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\controller\LeagueController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */