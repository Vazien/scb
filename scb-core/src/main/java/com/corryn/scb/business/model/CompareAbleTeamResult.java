/*    */ package com.corryn.scb.business.model;
/*    */ 
/*    */ import com.corryn.scb.data.persistence.model.TeamEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CompareAbleTeamResult
/*    */   implements Comparable<CompareAbleTeamResult>
/*    */ {
/*    */   private TeamEntity team;
/* 16 */   private Integer previousSchedules = Integer.valueOf(0);
/* 17 */   private Integer lastSchedule = Integer.valueOf(0);
/* 18 */   private Integer summary = Integer.valueOf(0);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public TeamEntity getTeam()
/*    */   {
/* 25 */     return this.team;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setTeam(TeamEntity team)
/*    */   {
/* 33 */     this.team = team;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getPreviousSchedules()
/*    */   {
/* 41 */     return this.previousSchedules;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setPreviousSchedules(Integer previousSchedules)
/*    */   {
/* 49 */     this.previousSchedules = previousSchedules;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getLastSchedule()
/*    */   {
/* 57 */     return this.lastSchedule;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setLastSchedule(Integer lastSchedule)
/*    */   {
/* 65 */     this.lastSchedule = lastSchedule;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getSummary()
/*    */   {
/* 73 */     return this.summary;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setSummary(Integer summary)
/*    */   {
/* 81 */     this.summary = summary;
/*    */   }
/*    */   
/*    */ 
/*    */   public int compareTo(CompareAbleTeamResult result)
/*    */   {
/* 87 */     return result.getSummary().compareTo(this.summary);
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\model\CompareAbleTeamResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */