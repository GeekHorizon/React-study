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

    @OneToOne
    private Category category;





    
}