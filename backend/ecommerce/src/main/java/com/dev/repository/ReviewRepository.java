package com.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    
    List<Review> findByProductId(Long productId);
}
