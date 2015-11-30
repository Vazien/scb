package com.corryn.scb.exchange.model;

public class AlbumImageDTO {
	private Long id;
	private String name;
	private byte[] data;
	private AlbumDTO album;
	private Boolean defaultImage;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return this.data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public AlbumDTO getAlbum() {
		return this.album;
	}

	public void setAlbum(AlbumDTO album) {
		this.album = album;
	}

	public Boolean isDefaultImage() {
		return this.defaultImage;
	}

	public void setDefaultImage(Boolean defaultImage) {
		this.defaultImage = defaultImage;
	}
}
