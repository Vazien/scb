package com.corryn.scb.data.persistence.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.368+0200")
@StaticMetamodel(ScheduleEntity.class)
public class ScheduleEntity_ {
	public static volatile SingularAttribute<ScheduleEntity, Long> id;
	public static volatile SingularAttribute<ScheduleEntity, Integer> index;
	public static volatile SingularAttribute<ScheduleEntity, Boolean> closed;
	public static volatile SingularAttribute<ScheduleEntity, Date> date;
	public static volatile SetAttribute<ScheduleEntity, ScheduleResultEntity> result;
}
