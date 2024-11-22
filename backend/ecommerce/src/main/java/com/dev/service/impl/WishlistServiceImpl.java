package com.dev.service.impl;

import org.springframework.stereotype.Service;

import com.dev.model.Product;
import com.dev.model.User;
import com.dev.model.Wishlist;
import com.dev.repository.WishlistRepository;
import com.dev.service.WishlistService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class WishlistServiceImpl implements WishlistService{

    private final WishlistRepository wishlistRepository;

    @Override
    public Wishlist createWishlist(User user) {
        Wishlist wishlist = new Wishlist();
        wishlist.setUser(user);
        return wishlistRepository.save(wishlist);
    }

    @Override
    public Wishlist getWishlistByUserId(User user) {
        Wishlist wishlist =  wishlistRepository.findByUserId(user.getId());
        if(wishlist == null) {
            wishlist = createWishlist(user);
        }
        return wishlist;
    }

    @Override
    public Wishlist addProductToWishlist(User user, Product product) {
        Wishlist wishlist = getWishlistByUserId(user);

        if(wishlist.getProducts().contains(product)) {
            wishlist.getProducts().remove(product);
        }
        else {
            wishlist.getProducts().add(product);
        }

        return wishlistRepository.save(wishlist);
    }
    
}
