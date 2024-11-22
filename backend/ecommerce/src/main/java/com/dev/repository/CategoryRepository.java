package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    Category findByCategoryId(String categoryId);
}
