package com.khc.study.domain.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Post
 */
@Entity
@Table
public class Post {
    
    @Id
	@GeneratedValue
	int id;

    
	String userId;
	String name;

	@Column(nullable = false)
	String title;

	String subtitle;

	@Lob
	String content;

	Date regDate;

	Date updateDate;

//	private int categoryId;

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "categoryId", insertable = false, updatable = false)
//	private Category category;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Date getRegDate() {
        return this.regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    // public int getCategoryId() {
    //     return this.categoryId;
    // }

    // public void setCategoryId(int categoryId) {
    //     this.categoryId = categoryId;
    // }

    // public Category getCategory() {
    //     return this.category;
    // }

    // public void setCategory(Category category) {
    //     this.category = category;
    // }

    public Post id(int id) {
        this.id = id;
        return this;
    }

    public Post userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Post name(String name) {
        this.name = name;
        return this;
    }

    public Post title(String title) {
        this.title = title;
        return this;
    }

    public Post subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Post content(String content) {
        this.content = content;
        return this;
    }

    public Post regDate(Date regDate) {
        this.regDate = regDate;
        return this;
    }

    public Post updateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    // public Post categoryId(int categoryId) {
    //     this.categoryId = categoryId;
    //     return this;
    // }

    // public Post category(Category category) {
    //     this.category = category;
    //     return this;
    // }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", name='" + getName() + "'" +
            ", title='" + getTitle() + "'" +
            ", subtitle='" + getSubtitle() + "'" +
            ", content='" + getContent() + "'" +
            ", regDate='" + getRegDate() + "'" +
            ", updateDate='" + getUpdateDate() + "'" +
      //      ", categoryId='" + getCategoryId() + "'" +
      //      ", category='" + getCategory() + "'" +
            "}";
    }



}