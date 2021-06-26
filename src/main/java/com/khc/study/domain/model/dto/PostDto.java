package com.khc.study.domain.model.dto;

import java.time.LocalDateTime;

/**
 * PostDto
 */
public class PostDto {
	private Long id;

	private String name;

	private String title;

	private String subtitle;

	private String content;
    
    private LocalDateTime createdTimeAt;
    
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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