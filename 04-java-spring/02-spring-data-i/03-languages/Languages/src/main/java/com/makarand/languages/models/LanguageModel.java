package com.makarand.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "languages")
public class LanguageModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2, max = 20)
	private String language;
	@Size(min = 2, max = 20)
	private String creator;
	@NotBlank
	private String version;
	// Update
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyy-MM-D HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyy-MM-D HH:mm:ss")
	private Date updatedAt;
	//@PrePersist for create 
	@PrePersist
	protected void oncreate() {
		this.createdAt =new Date();
	}
	//@PreUpdate for update 
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	

	// Constructor
	public LanguageModel() {
		
	}

	public LanguageModel(String language, String creator, String version) {
		this.language = language;
		this.creator = creator;
		this.version = version;
	}

	// Getter and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
