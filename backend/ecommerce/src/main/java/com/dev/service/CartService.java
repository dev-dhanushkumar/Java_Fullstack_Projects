package com.dev.service;

import com.dev.model.Cart;
import com.dev.model.CartItem;
import com.dev.model.Product;
import com.dev.model.User;

public interface CartService {
    
    public CartItem addCartItem(User user, Product product, String size,int quantity);

    public Cart findUserCart(User user);
}
