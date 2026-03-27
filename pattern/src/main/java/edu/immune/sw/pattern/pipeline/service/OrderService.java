package edu.immune.sw.pattern.pipeline.service;

import edu.immune.sw.pattern.pipeline.model.Cart;
import edu.immune.sw.pattern.pipeline.model.Order;

public class OrderService {
    public Order createOrder(Cart cart) {
        return new Order(cart);
    }
}
