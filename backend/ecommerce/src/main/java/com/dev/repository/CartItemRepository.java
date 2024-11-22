package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Cart;
import com.dev.model.CartItem;
import com.dev.model.Product;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{
    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);
}
