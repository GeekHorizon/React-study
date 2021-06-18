package com.khc.study.infrastructure.dao;

import com.khc.study.domain.model.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PostDao
 */
public interface PostDao extends JpaRepository<Post, Integer> {
}
