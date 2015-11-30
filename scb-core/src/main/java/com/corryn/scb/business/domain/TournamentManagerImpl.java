/*    */ package com.corryn.scb.business.domain;
/*    */
/*    */ import com.corryn.scb.data.converter.TournamentEntityDTOConverter;
import com.corryn.scb.data.dao.domain.TournamentDAO;
/*    */ import com.corryn.scb.data.persistence.model.TournamentEntity;
/*    */ import com.corryn.scb.exchange.model.TournamentDTO;

/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ import javax.ejb.Stateless;
/*    */ import javax.ejb.TransactionAttribute;
/*    */ import javax.ejb.TransactionAttributeType;
/*    */ import javax.ejb.TransactionManagement;
/*    */ import javax.ejb.TransactionManagementType;
/*    */ import javax.inject.Inject;
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
/*    */ @Stateless
/*    */ @TransactionManagement(TransactionManagementType.CONTAINER)
/*    */ @TransactionAttribute(TransactionAttributeType.REQUIRED)
/*    */ public class TournamentManagerImpl
/*    */   implements TournamentManager
/*    */ {
/*    */   @Inject
/*    */   private TournamentDAO tournamentDAO;
/*    */
/*    */   public List<TournamentDTO> getOpenTournaments()
/*    */   {
/* 37 */     List<TournamentEntity> tournaments = this.tournamentDAO.findEntitiesByAttribute("closed", Boolean.FALSE);
/* 38 */     List<TournamentDTO> tournamentDTOList = new ArrayList<TournamentDTO>();
/* 39 */     TournamentEntityDTOConverter converter = new TournamentEntityDTOConverter();
/* 40 */     for (TournamentEntity entity : tournaments)
/*    */     {
/* 42 */       tournamentDTOList.add(converter.toDTO(entity));
/*    */     }
/* 44 */     return tournamentDTOList;
/*    */   }
/*    */
/*    */
/*    */   public List<TournamentDTO> getClosedTournaments()
/*    */   {
/* 50 */     List<TournamentEntity> tournaments = this.tournamentDAO.findEntitiesByAttribute("closed", Boolean.TRUE);
/* 51 */     List<TournamentDTO> tournamentDTOList = new ArrayList<TournamentDTO>();
/* 52 */     TournamentEntityDTOConverter converter = new TournamentEntityDTOConverter();
/* 53 */     for (TournamentEntity entity : tournaments)
/*    */     {
/* 55 */       tournamentDTOList.add(converter.toDTO(entity));
/*    */     }
/* 57 */     return tournamentDTOList;
/*    */   }
/*    */
/*    */
/*    */   public TournamentDTO saveTournament(TournamentDTO dto)
/*    */   {
/* 63 */     TournamentEntity entity = new TournamentEntityDTOConverter().toEntity(dto);
/* 64 */     if (entity.getId() == null)
/*    */     {
/* 66 */       this.tournamentDAO.persist(entity);
/*    */     }
/*    */     else
/*    */     {
/* 70 */       this.tournamentDAO.merge(entity);
/*    */     }
/* 72 */     return new TournamentEntityDTOConverter().toDTO(entity);
/*    */   }
/*    */
/*    */
/*    */   public void deleteTournament(TournamentDTO dto)
/*    */   {
/* 78 */     TournamentEntity entity = (TournamentEntity)this.tournamentDAO.findEntityByAttribute("id", dto.getId());
/* 79 */     this.tournamentDAO.remove(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\domain\TournamentManagerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */