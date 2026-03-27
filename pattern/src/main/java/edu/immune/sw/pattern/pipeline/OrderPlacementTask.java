package edu.immune.sw.pattern.pipeline;

import edu.immune.sw.pattern.pipeline.model.Cart;
import edu.immune.sw.pattern.pipeline.model.Order;
import edu.immune.sw.pattern.pipeline.service.OrderService;

public class OrderPlacementTask implements Task<Cart, Order> {

    private final OrderService orderService = new OrderService();

    @Override
    public Order execute(Cart cart) {
        System.out.println("Placing Order");
        return orderService.createOrder(cart);
    }
}
