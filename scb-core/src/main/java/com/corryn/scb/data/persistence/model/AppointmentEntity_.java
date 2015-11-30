package com.corryn.scb.data.persistence.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.358+0200")
@StaticMetamodel(AppointmentEntity.class)
public class AppointmentEntity_ {
	public static volatile SingularAttribute<AppointmentEntity, Long> id;
	public static volatile SingularAttribute<AppointmentEntity, String> description;
	public static volatile SingularAttribute<AppointmentEntity, Date> date;
}
