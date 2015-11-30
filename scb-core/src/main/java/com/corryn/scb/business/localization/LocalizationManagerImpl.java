/*    */ package com.corryn.scb.business.localization;
/*    */
/*    */ import com.corryn.scb.core.enumeration.Localization;
import com.corryn.scb.data.dao.localization.LocalizationDAO;
/*    */ import com.corryn.scb.data.persistence.model.localization.LocalizationEntity;

/*    */ import java.util.List;

/*    */ import javax.ejb.Stateless;
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
/*    */ public class LocalizationManagerImpl
/*    */   implements LocalizationManager
/*    */ {
/*    */   @Inject
/*    */   private LocalizationDAO localizationDAO;
/*    */
/*    */   public List<LocalizationEntity> getLocalizationEntries(Localization localization)
/*    */   {
/* 29 */     return this.localizationDAO.findEntitiesByAttribute("locaLocalization", localization);
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\localization\LocalizationManagerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */