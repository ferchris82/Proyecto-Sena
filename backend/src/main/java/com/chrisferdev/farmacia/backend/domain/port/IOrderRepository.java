package com.chrisferdev.farmacia.backend.domain.port;

import com.chrisferdev.farmacia.backend.domain.model.Order;

public interface IOrderRepository {
    Order save(Order order);
    Order findById(Integer id);
    Iterable<Order> findAll();
    Iterable<Order> findByUserId(Integer user);
    void updateStateById(Integer id, String state);
}
