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

    public long getPostNo() {
        return this.postNo;
    }

    public void setPostNo(long postNo) {
        this.postNo = postNo;
    }

    public Post postNo(long postNo) {
        this.postNo = postNo;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " postNo='" + getPostNo() + "'" +
            "}";
    }
}