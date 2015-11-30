package com.corryn.scb.data.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-20T10:16:24.358+0200")
@StaticMetamodel(AlbumImageEntity.class)
public class AlbumImageEntity_ {
	public static volatile SingularAttribute<AlbumImageEntity, Long> id;
	public static volatile SingularAttribute<AlbumImageEntity, String> name;
	public static volatile SingularAttribute<AlbumImageEntity, byte[]> data;
	public static volatile SingularAttribute<AlbumImageEntity, AlbumEntity> album;
	public static volatile SingularAttribute<AlbumImageEntity, Boolean> defaultImage;
}
