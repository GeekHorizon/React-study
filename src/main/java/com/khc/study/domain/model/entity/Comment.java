package com.khc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Comment
 */
@Entity
@Table
public class Comment {

    @Id
    @Column(name = "comment_no")
    private String commentNo; 


    public String getCommentNo() {
        return this.commentNo;
    }

    public void setCommentNo(String commentNo) {
        this.commentNo = commentNo;
    }

  
    public Comment commentNo(String commentNo) {
        this.commentNo = commentNo;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " commentNo='" + getCommentNo() + "'" +
            "}";
    }

}