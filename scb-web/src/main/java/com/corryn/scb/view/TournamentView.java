/*     */ package com.corryn.scb.view;
/*     */ 
/*     */ import com.corryn.scb.business.domain.TournamentManager;
/*     */ import com.corryn.scb.enumeration.TournamentState;
/*     */ import com.corryn.scb.exchange.model.TournamentDTO;

/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;

/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.ejb.EJB;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;

/*     */ import org.primefaces.event.FileUploadEvent;
/*     */ import org.primefaces.model.DefaultStreamedContent;
/*     */ import org.primefaces.model.StreamedContent;
/*     */ import org.primefaces.model.UploadedFile;
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
/*     */ @ViewScoped
/*     */ @ManagedBean
/*     */ public class TournamentView
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @EJB
/*     */   TournamentManager tournamentManager;
/*  39 */   private List<TournamentDTO> tournaments = null;
/*  40 */   private TournamentState state = null;
/*     */   
/*  42 */   private TournamentDTO selectedTournament = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostConstruct
/*     */   public void onConstruct()
/*     */   {
/*  50 */     loadTournaments(TournamentState.OPEN);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doLoadOpenTournaments()
/*     */   {
/*  58 */     loadTournaments(TournamentState.OPEN);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doLoadClosedTournaments()
/*     */   {
/*  66 */     loadTournaments(TournamentState.CLOSED);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private void loadTournaments(TournamentState state)
/*     */   {
/*  74 */     setState(state);
/*  75 */     if (TournamentState.OPEN == state)
/*     */     {
/*  77 */       setTournaments(this.tournamentManager.getOpenTournaments());
/*     */     }
/*     */     else
/*     */     {
/*  81 */       setTournaments(this.tournamentManager.getClosedTournaments());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doCreate()
/*     */   {
/*  90 */     setSelectedTournament(new TournamentDTO());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doSave()
/*     */   {
/*  98 */     this.tournamentManager.saveTournament(getSelectedTournament());
/*  99 */     loadTournaments(getState());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doDelete(TournamentDTO dto)
/*     */   {
/* 107 */     this.tournamentManager.deleteTournament(dto);
/* 108 */     this.tournaments.remove(dto);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doRemoveInvitation()
/*     */   {
/* 116 */     getSelectedTournament().setInvitationName(null);
/* 117 */     getSelectedTournament().setInvitation(null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void doUploadInvitation(FileUploadEvent event)
/*     */   {
/* 125 */     getSelectedTournament().setInvitationName(event.getFile().getFileName());
/* 126 */     getSelectedTournament().setInvitation(event.getFile().getContents());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StreamedContent doInvitationDownload(TournamentDTO dto)
/*     */   {
/* 135 */     return new DefaultStreamedContent(new ByteArrayInputStream(dto.getInvitation()), "application/octet-stream", dto.getInvitationName());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<TournamentDTO> getTournaments()
/*     */   {
/* 143 */     return this.tournaments;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private void setTournaments(List<TournamentDTO> tournaments)
/*     */   {
/* 151 */     this.tournaments = tournaments;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public TournamentState getState()
/*     */   {
/* 159 */     return this.state;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private void setState(TournamentState state)
/*     */   {
/* 167 */     this.state = state;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public TournamentDTO getSelectedTournament()
/*     */   {
/* 175 */     return this.selectedTournament;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSelectedTournament(TournamentDTO selectedTournament)
/*     */   {
/* 183 */     this.selectedTournament = selectedTournament;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInvitation(TournamentDTO dto)
/*     */   {
/* 192 */     if (dto.getInvitation() != null)
/*     */     {
/* 194 */       return true;
/*     */     }
/* 196 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\gh29142\Desktop\SCBWeb.war!\WEB-INF\classes\com\corryn\scb\view\TournamentView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */