/*    */ package com.corryn.scb.business.enumeration;
/*    */
/*    */
/*    */ import java.util.Locale;

/*    */ import javax.ejb.Stateless;

import com.corryn.scb.core.enumeration.Localization;
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
/*    */ @Stateless
/*    */ public class EnumerationManagerImpl
/*    */   implements EnumerationManager
/*    */ {
/*    */   public Localization[] getAllLocalization()
/*    */   {
/* 24 */     return Localization.values();
/*    */   }
/*    */
/*    */
/*    */   public Localization getLocalizationForLocale(Locale locale)
/*    */   {
/* 30 */     return Localization.valueOf(locale.getLanguage().toUpperCase());
/*    */   }
/*    */ }


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\enumeration\EnumerationManagerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */