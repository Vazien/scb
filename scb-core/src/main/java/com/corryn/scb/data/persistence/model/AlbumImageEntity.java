package com.corryn.scb.data.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALBUMIMAGE")
public class AlbumImageEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private byte[] data;
	private AlbumEntity album;
	private Boolean defaultImage;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DATA")
	public byte[] getData() {
		return this.data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = AlbumEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "ALBUM_ID", referencedColumnName = "ID", insertable = true, updatable = true) })
	public AlbumEntity getAlbum() {
		return this.album;
	}

	public void setAlbum(AlbumEntity album) {
		this.album = album;
	}

	@Column(name = "DEFAULT_IMAGE")
	public Boolean isDefaultImage() {
		return this.defaultImage;
	}

	public void setDefaultImage(Boolean defaultImage) {
		this.defaultImage = defaultImage;
	}
}
