package com.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    List<Transaction> findBySellerId(Long sellerId);
    
}
