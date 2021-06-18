package com.khc.study.infrastructure.dao;

import com.khc.study.domain.model.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CategoryDao
 */
public interface CategoryDao extends JpaRepository<Category, String> {
}