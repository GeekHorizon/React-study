package com.khc.study.infrastructure.dao;

import com.khc.study.domain.model.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CommentDao
 */
public interface CommentDao extends JpaRepository<Comment, String> {

}