package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
