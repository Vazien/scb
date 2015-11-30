package com.corryn.scb.data.persistence.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.378+0200")
@StaticMetamodel(TournamentEntity.class)
public class TournamentEntity_ {
	public static volatile SingularAttribute<TournamentEntity, Long> id;
	public static volatile SingularAttribute<TournamentEntity, String> name;
	public static volatile SingularAttribute<TournamentEntity, Date> date;
	public static volatile SingularAttribute<TournamentEntity, byte[]> invitation;
	public static volatile SingularAttribute<TournamentEntity, Boolean> closed;
	public static volatile SingularAttribute<TournamentEntity, String> invitationName;
}
