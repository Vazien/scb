package com.corryn.scb.data.persistence.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.378+0200")
@StaticMetamodel(VisitEntity.class)
public class VisitEntity_ {
	public static volatile SingularAttribute<VisitEntity, Long> id;
	public static volatile SingularAttribute<VisitEntity, String> visiSessionId;
	public static volatile SingularAttribute<VisitEntity, Date> visiDate;
}
