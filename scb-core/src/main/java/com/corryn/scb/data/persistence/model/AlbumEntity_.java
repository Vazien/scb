package com.corryn.scb.data.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.358+0200")
@StaticMetamodel(AlbumEntity.class)
public class AlbumEntity_ {
	public static volatile SingularAttribute<AlbumEntity, Long> id;
	public static volatile SingularAttribute<AlbumEntity, String> name;
	public static volatile SetAttribute<AlbumEntity, AlbumImageEntity> images;
}
