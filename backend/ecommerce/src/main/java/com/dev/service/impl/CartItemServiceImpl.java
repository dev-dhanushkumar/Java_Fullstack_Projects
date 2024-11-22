package com.dev.service.impl;

import org.springframework.stereotype.Service;

import com.dev.model.CartItem;
import com.dev.model.User;
import com.dev.repository.CartItemRepository;
import com.dev.service.CartItemService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;
    

    @Override
    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws Exception {
        CartItem item = findCartItem(id); //Watch this place

        User cartItemUser = item.getCart().getUser();

        if(cartItemUser.getId().equals(userId)) {
            item.setQuantity(cartItem.getQuantity());
            item.setMrpPrice(item.getQuantity() * item.getProduct().getMrpPrice());
            item.setSellingPrice(item.getQuantity() * item.getProduct().getSellingPrice());
            return cartItemRepository.save(item);
        }
        throw new Exception("You can't update this cart item");
    }

    @Override
    public void removeCartItem(Long userId, Long cartItemId) throws Exception {
        CartItem item = findCartItem(cartItemId); //Watch this place

        User cartItemUser = item.getCart().getUser();

        if(cartItemUser.getId().equals(userId)) {
            cartItemRepository.delete(item);
        }
        else throw new Exception("you can't delete this item");

    }

    @Override
    public CartItem findCartItem(Long id) throws Exception {
        return cartItemRepository.findById(id).orElseThrow(() ->
            new Exception("cart item not found with id "+ id)
        );
    }
    
}
