package edu.immune.sw.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class FilterOnOrderStatus implements Filter<Order, OrderStatus> {

    @Override
    public List<Order> filter(List<Order> input, OrderStatus status) {
        List<Order> filteredOrders = new LinkedList<>();

        for(Order order: input) {
            if(status.equals(order.getOrderStatus()))
                filteredOrders.add(order);
        }

        return filteredOrders;
    }
}
