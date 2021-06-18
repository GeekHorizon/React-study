package com.khc.study.infrastructure.dao;

import com.khc.study.domain.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserDao
 */
public interface UserDao extends JpaRepository<User, String> {    
}


