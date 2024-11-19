package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
