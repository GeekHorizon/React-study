package com.khc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Comment
 */
public class Comment {

    @Id
    @Column(name = "comment_no")
    private String commentNo; 

    @OneToOne
    private Category category;

    public String getCommentNo() {
        return this.commentNo;
    }

    public void setCommentNo(String commentNo) {
        this.commentNo = commentNo;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Comment commentNo(String commentNo) {
        this.commentNo = commentNo;
        return this;
    }

    public Comment category(Category category) {
        this.category = category;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) o;
        return Objects.equals(commentNo, comment.commentNo) && Objects.equals(category, comment.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentNo, category);
    }

    @Override
    public String toString() {
        return "{" +
            " commentNo='" + getCommentNo() + "'" +
            ", category='" + getCategory() + "'" +
            "}";
    }

}