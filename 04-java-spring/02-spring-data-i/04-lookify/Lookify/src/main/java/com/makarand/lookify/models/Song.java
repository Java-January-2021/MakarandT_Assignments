package com.makarand.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "lookify")
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 5, max = 20)
	private String title;

	@NotBlank
	@Size(min = 5, max = 20)
	private String artist;

	@NotNull (message = "Rating must be between 1 to 10")
	@Min(value = 1) 
	@Max(value = 10)
	private int rating;


	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyy-MM-D HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyy-MM-D HH:mm:ss")
	private Date updatedAt;

	// @PrePersist for create
	@PrePersist
	protected void oncreate() {
		this.createdAt =new Date();
	}

	// @PreUpdate for update
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	//constructor 
	public Song() {
	}

	public Song( @NotBlank @Size(min = 5, max = 20) String title,
			@NotBlank @Size(min = 5, max = 20) String artist, @NotBlank @Size(min = 1, max = 10) int rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		}
	//Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
	

}	
	