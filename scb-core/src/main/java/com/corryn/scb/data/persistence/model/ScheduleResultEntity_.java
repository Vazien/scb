package com.corryn.scb.data.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.368+0200")
@StaticMetamodel(ScheduleResultEntity.class)
public class ScheduleResultEntity_ {
	public static volatile SingularAttribute<ScheduleResultEntity, Long> id;
	public static volatile SingularAttribute<ScheduleResultEntity, Integer> points;
	public static volatile SingularAttribute<ScheduleResultEntity, TeamEntity> team;
}
