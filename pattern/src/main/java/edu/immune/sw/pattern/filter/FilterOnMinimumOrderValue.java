package edu.immune.sw.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class FilterOnMinimumOrderValue implements Filter<Order, Double> {

    @Override
    public List<Order> filter(List<Order> input, Double minOrderValue) {
        List<Order> filteredOrders = new LinkedList<>();

        for(Order order: input) {
            if(order.getOrderValue() >= minOrderValue)
                filteredOrders.add(order);
        }

        return filteredOrders;
    }
}
