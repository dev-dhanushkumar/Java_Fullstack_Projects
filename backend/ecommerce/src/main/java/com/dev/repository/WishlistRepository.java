package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long>{
    
    Wishlist findByUserId(Long userId);

}
