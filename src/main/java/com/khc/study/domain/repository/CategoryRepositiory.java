package com.khc.study.domain.repository;

import com.khc.study.infrastructure.dao.CategoryDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * CategoryRepositiory
 */
@Repository
public class CategoryRepositiory {

    @Autowired
    private CategoryDao categoryDao;


    
    
}