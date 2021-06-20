package com.khc.study.domain.repository;

import java.util.Date;

import com.khc.study.domain.model.entity.Post;
import com.khc.study.infrastructure.dao.PostDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PostRepository
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}