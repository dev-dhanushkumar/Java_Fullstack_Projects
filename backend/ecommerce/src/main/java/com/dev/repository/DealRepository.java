package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Deal;

public interface DealRepository extends JpaRepository<Deal, Long>{
    
}
