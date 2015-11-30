package com.corryn.scb.data.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.358+0200")
@StaticMetamodel(LeagueEntity.class)
public class LeagueEntity_ {
	public static volatile SingularAttribute<LeagueEntity, Long> id;
	public static volatile SingularAttribute<LeagueEntity, String> year;
	public static volatile SingularAttribute<LeagueEntity, LeagueTypeEntity> leagueType;
	public static volatile SetAttribute<LeagueEntity, ScheduleEntity> schedule;
	public static volatile SetAttribute<LeagueEntity, TeamEntity> teams;
}
