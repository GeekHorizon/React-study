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


    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRgstDate() {
        return this.rgstDate;
    }

    public void setRgstDate(Date rgstDate) {
        this.rgstDate = rgstDate;
    }

    public Date getModDate() {
        return this.modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Category categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Category name(String name) {
        this.name = name;
        return this;
    }

    public Category rgstDate(Date rgstDate) {
        this.rgstDate = rgstDate;
        return this;
    }

    public Category modDate(Date modDate) {
        this.modDate = modDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Category)) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(categoryId, category.categoryId) && Objects.equals(name, category.name) && Objects.equals(rgstDate, category.rgstDate) && Objects.equals(modDate, category.modDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, rgstDate, modDate);
    }

    @Override
    public String toString() {
        return "{" +
            " categoryId='" + getCategoryId() + "'" +
            ", name='" + getName() + "'" +
            ", rgstDate='" + getRgstDate() + "'" +
            ", modDate='" + getModDate() + "'" +
            "}";
    }

}