package com.khc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Post
 */
@Entity
@Table
public class Post {
    
    @Id
    @Column(name = "post_no")
    private long postNo; 

    //@OneToOne
    private Category category;

    public Post(long postNo, Category category) {
        this.postNo = postNo;
        this.category = category;
    }

    public long getPostNo() {
        return this.postNo;
    }

    public void setPostNo(long postNo) {
        this.postNo = postNo;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Post postNo(long postNo) {
        this.postNo = postNo;
        return this;
    }

    public Post category(Category category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " postNo='" + getPostNo() + "'" +
            ", category='" + getCategory() + "'" +
            "}";
    }
}