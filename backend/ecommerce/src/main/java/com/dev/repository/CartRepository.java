package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
    Cart findByUserId(Long id);
}
