package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.HomeCategory;

public interface HomeCategoryRepository extends JpaRepository<HomeCategory, Long>{
    
}
