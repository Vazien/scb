package com.corryn.scb.data.persistence.model.localization;

import com.corryn.scb.core.enumeration.Localization;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.368+0200")
@StaticMetamodel(LocalizationEntity.class)
public class LocalizationEntity_ {
	public static volatile SingularAttribute<LocalizationEntity, Long> id;
	public static volatile SingularAttribute<LocalizationEntity, Localization> locaLocalization;
	public static volatile SingularAttribute<LocalizationEntity, String> locaKey;
	public static volatile SingularAttribute<LocalizationEntity, String> locaEntry;
}
