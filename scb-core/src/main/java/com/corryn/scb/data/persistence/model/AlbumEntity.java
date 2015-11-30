package com.corryn.scb.data.persistence.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ALBUM")
public class AlbumEntity implements IdEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<AlbumImageEntity> images;

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

	@OneToMany(fetch = FetchType.LAZY, targetEntity = AlbumImageEntity.class)
	@JoinColumns({ @javax.persistence.JoinColumn(name = "ALBUM_ID", referencedColumnName = "ID", insertable = true, updatable = true) })
	public Set<AlbumImageEntity> getImages() {
		return this.images;
	}

	public void setImages(Set<AlbumImageEntity> images) {
		this.images = images;
	}
}
