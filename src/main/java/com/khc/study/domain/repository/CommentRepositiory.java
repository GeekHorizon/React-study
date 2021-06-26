package com.khc.study.domain.repository;

import com.khc.study.domain.model.entity.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CommentRepository
 */
public interface CommentRepositiory extends JpaRepository<Comment, Long> {  
}