package com.khc.study.domain.repository;

import com.khc.study.domain.model.entity.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CategoryRepositiory
 */
public interface CategoryRepositiory extends JpaRepository<Category, Long> {
}