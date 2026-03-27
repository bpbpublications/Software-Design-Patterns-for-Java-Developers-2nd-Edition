package edu.immune.sw.pattern.filter;

import java.util.List;

public class AndFilter<F, S> implements Filter<Order, FilterOn<F, S>> {

    @Override
    public List<Order> filter(List<Order> orders, FilterOn<F, S> filterOn) {
        List<Order> filteredOrders = filterOn.firstFilter.filter(orders, filterOn.firstFilterCheck);
        filteredOrders = filterOn.secondFilter.filter(filteredOrders, filterOn.secondFilterCheck);

        return filteredOrders;
    }
}
