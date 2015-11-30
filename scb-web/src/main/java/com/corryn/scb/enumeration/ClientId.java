/*    */ package com.corryn.scb.enumeration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ClientId
/*    */ {
/* 11 */   GLOBALMESSAGE_TEMPLATE("jo"), 
/* 12 */   ALBUMDETAIL_GALLERY("albumDetail"), 
/* 13 */   ALBUMLIST_GALLERY("albumList"), 
/* 14 */   APPOINTMENTDETAIL_APPOINTMENT("appointmentDetail"), 
/* 15 */   APPOINTMENTFORM_APPOINTMENT("appointmentForm"), 
/* 16 */   APPOINTMENTSTABLE_APPOINTMENT("appointmentsTable"), 
/* 17 */   CONTAINER_INIT("container"), 
/* 18 */   DATE_APPOINTMENT("date"), 
/* 19 */   DATE_TOURNAMENT("date"), 
/* 20 */   DESCRIPTION_APPOINTMENT("description"), 
/* 21 */   DESCRIPTION_TOURNAMENT("description"), 
/* 22 */   DISPLAYONLYCURRENTSWITCHER_APPOINTMENT("displayOnlyCurrentSwitcher"), 
/* 23 */   GALLERYDETAILFORM_GALLERYDETAIL("galleryDetailForm"), 
/* 24 */   GALLERYFORM_GALLERY("galleryForm"), 
/* 25 */   INTROFORM_INIT("introForm"), 
/* 26 */   INTRO_INIT("intro"), 
/* 27 */   INVITATIONNAME_TOURNAMENT("invitationName"), 
/* 28 */   LEAGUEEDITFORM_LEAGUE("leagueEditForm"), 
/* 29 */   LEAGUEFORM_LEAGUE("leagueForm"), 
/* 30 */   LEAGUEGRID_GALLERYDETAIL("leagueGrid"), 
/* 31 */   LEAGUEGRID_LEAGUE("leagueGrid"), 
/* 32 */   LEAGUEMANAGERFORM_LEAGUEMANAGER("leagueManagerForm"), 
/* 33 */   LEAGUESTABLE_LEAGUE("leaguesTable"), 
/* 34 */   LOGINFORM_LOGIN("loginForm"), 
/* 35 */   MESSAGES_LOGIN("messages"), 
/* 36 */   NAME_GALLERY("name"), 
/* 37 */   NAVIGATION_INIT("navigation"), 
/* 38 */   PASSWORD_LOGIN("password"), 
/* 39 */   RESULTTABLE_LEAGUE("resultTable"), 
/* 40 */   SCHEDULETABLE_LEAGUE("scheduleTable"), 
/* 41 */   TOURNAMENTCLOSEDSWITCHER_TOURNAMENT("tournamentClosedSwitcher"), 
/* 42 */   TOURNAMENTDETAIL_TOURNAMENT("tournamentDetail"), 
/* 43 */   TOURNAMENTFORM_TOURNAMENT("tournamentForm"), 
/* 44 */   TOURNAMENTTABLE_TOURNAMENT("tournamentTable"), 
/* 45 */   USERNAME_LOGIN("username");
/*    */   
/*    */   private String id;
/*    */   
/*    */   private ClientId(String id)
/*    */   {
/* 51 */     this.id = id;
/*    */   }
/*    */   
/*    */   public String getId()
/*    */   {
/* 56 */     return this.id;
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\enumeration\ClientId.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */