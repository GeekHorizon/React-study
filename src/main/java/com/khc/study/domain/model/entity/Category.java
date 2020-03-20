package com.khc.study.domain.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Post
 */
@Entity
@Table
public class Category {
    
    @Id
    @Column(name = "category_id")
    private String categoryId; 

    @Column(name = "name")
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "rgst_date")
    private Date rgstDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "mod_date")
    private Date modDate;
}