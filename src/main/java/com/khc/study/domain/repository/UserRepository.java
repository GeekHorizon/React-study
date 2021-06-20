package com.khc.study.domain.repository;

import java.util.Optional;

import com.khc.study.domain.model.entity.User;
import com.khc.study.infrastructure.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {
}