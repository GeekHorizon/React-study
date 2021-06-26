package com.khc.study.domain.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.khc.study.domain.model.dto.PostDto;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Post
 */
@Entity
@Table
public class Post {
    
    @Id
	@GeneratedValue
    @Column(name = "post_id")
	private Long id;
    
	private String name;

	@Column(nullable = false)
	private String title;

	private String subtitle;

	@Lob
	private String content;

    @CreationTimestamp
    private LocalDateTime createdTimeAt;
    
    @UpdateTimestamp
    private LocalDateTime updateTimeAt;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.content = builder.content;
        this.createdTimeAt = builder.createdTimeAt;
        this.updateTimeAt = builder.updateTimeAt;
    }

    public Post() {
    }

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


    public List<Comment> getComments() {
        return this.comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
        comment.setPost(this);
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", title='" + getTitle() + "'" +
            ", subtitle='" + getSubtitle() + "'" +
            ", content='" + getContent() + "'" +
            ", createdTimeAt='" + getCreatedTimeAt() + "'" +
            ", updateTimeAt='" + getUpdateTimeAt() + "'" +
            ", comments='" + getComments() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

    public static class Builder {
        private Long id;
	    private String name;
        private String title;
        private String subtitle;
        private String content;
        private LocalDateTime createdTimeAt;
        private LocalDateTime updateTimeAt;

        public Builder(PostDto postDto) {
            this.id = postDto.getId();
            this.name = postDto.getName();
            this.title = postDto.getTitle();
            this.subtitle = postDto.getSubtitle();
            this.content = postDto.getContent();
            this.createdTimeAt = postDto.getCreatedTimeAt();
            this.updateTimeAt = postDto.getUpdateTimeAt();
        }

        public Post build(){
            return new Post(this);
        }
    }


}