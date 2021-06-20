package com.khc.study.domain.model.entity;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Post
 */
@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private Long id;

	@Column(unique = true)
	private String name;

	@CreationTimestamp
	private LocalDateTime createdTimeAt;

	@UpdateTimestamp
	private LocalDateTime updateTimeAt;

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

	public LocalDateTime getCreatedTimeAt() {
		return this.createdTimeAt;
	}

	public void setCreatedTimeAt(LocalDateTime createdTimeAt) {
		this.createdTimeAt = createdTimeAt;
	}

	public LocalDateTime getUpdateTimeAt() {
		return this.updateTimeAt;
	}

	public void setUpdateTimeAt(LocalDateTime updateTimeAt) {
		this.updateTimeAt = updateTimeAt;
	}
	

}
