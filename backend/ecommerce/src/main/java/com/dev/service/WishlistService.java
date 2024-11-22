package com.dev.service;

import com.dev.model.Product;
import com.dev.model.User;
import com.dev.model.Wishlist;

public interface WishlistService {


    Wishlist createWishlist(User user);
    Wishlist getWishlistByUserId(User user);
    Wishlist addProductToWishlist(User user, Product product);


}
