package com.khc.study.domain.repository;


import com.khc.study.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {
}