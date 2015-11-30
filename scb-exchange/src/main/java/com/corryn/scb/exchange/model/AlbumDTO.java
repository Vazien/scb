package com.corryn.scb.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class AlbumDTO {
	private Long id;
	private String name;
	private List<AlbumImageDTO> images;

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

	public List<AlbumImageDTO> getImages() {
		if (this.images == null) {
			this.images = new ArrayList<AlbumImageDTO>();
		}
		return this.images;
	}

	public void setImages(List<AlbumImageDTO> images) {
		this.images = images;
	}
}
