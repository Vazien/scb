/*     */ package com.corryn.scb.view;
/*     */ 
/*     */ import com.corryn.scb.business.domain.LeagueManager;
/*     */ import com.corryn.scb.enumeration.League;
/*     */ import com.corryn.scb.exchange.model.LeagueDTO;
/*     */ import com.corryn.scb.exchange.model.LeagueResultDTO;

/*     */ import java.io.Serializable;
/*     */ import java.util.List;

/*     */ import javax.ejb.EJB;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.SessionScoped;
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
/*     */ 
/*     */ 
/*     */ @ManagedBean(name="leagueView")
/*     */ @SessionScoped
/*     */ public class LeagueView
/*     */   implements Serializable
/*     */ {
/*     */   @EJB
/*     */   LeagueManager leagueManager;
/*     */   private static final long serialVersionUID = 1L;
/*     */   private League league;
/*     */   private LeagueDTO leagueDTO;
/*     */   private LeagueResultDTO leagueResult;
/*     */   private List<String> years;
/*     */   private String selectedYear;
/*     */   
/*     */   public void init(League league)
/*     */   {
/*  46 */     this.league = league;
/*  47 */     this.years = this.leagueManager.getYears(league.getLeague());
/*  48 */     this.selectedYear = ((String)this.years.get(0));
/*  49 */     loadLeague(this.selectedYear);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void loadLeague(String year)
/*     */   {
/*  57 */     this.selectedYear = year;
/*  58 */     this.leagueDTO = this.leagueManager.getLeague(this.league.getLeague(), this.selectedYear);
/*  59 */     this.leagueResult = this.leagueManager.getLeagueResult(this.leagueDTO.getId());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHeadline()
/*     */   {
/*  67 */     if (League.BAVARIAN == this.league)
/*     */     {
/*  69 */       return " Bayernliga";
/*     */     }
/*  71 */     return " Landesliga";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<String> getYears()
/*     */   {
/*  79 */     return this.years;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setYears(List<String> years)
/*     */   {
/*  87 */     this.years = years;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public LeagueDTO getLeague()
/*     */   {
/*  95 */     return this.leagueDTO;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLeague(LeagueDTO league)
/*     */   {
/* 103 */     this.leagueDTO = league;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public LeagueResultDTO getLeagueResult()
/*     */   {
/* 111 */     return this.leagueResult;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLeagueResult(LeagueResultDTO leagueResult)
/*     */   {
/* 119 */     this.leagueResult = leagueResult;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSelectedYear()
/*     */   {
/* 127 */     return this.selectedYear;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSelectedYear(String selectedYear)
/*     */   {
/* 135 */     this.selectedYear = selectedYear;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSelectedLeague()
/*     */   {
/* 144 */     return this.league.getLeague();
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\LeagueView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */