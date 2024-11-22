package com.dev.service;

import java.util.List;
import java.util.Set;

import com.dev.domain.OrderStatus;
import com.dev.model.Address;
import com.dev.model.Cart;
import com.dev.model.Order;
import com.dev.model.OrderItem;
import com.dev.model.User;

public interface OrderService {
    Set<Order> createOrder(User user, Address shippingAddress, Cart cart);
    Order findOrderById(Long id) throws Exception;
    List<Order> userOrderHistory(Long userId);
    List<Order> sellersOrder(Long sellerId);
    Order updateOrderStatus(Long orderId, OrderStatus orderStatus) throws Exception;
    Order cancelOrder(Long orderId, User user) throws Exception;
    OrderItem getOrderItemById(Long id) throws Exception;
}
