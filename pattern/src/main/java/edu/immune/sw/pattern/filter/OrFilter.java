package edu.immune.sw.pattern.filter;

import java.util.List;

public class OrFilter<F, S> implements Filter<Order, FilterOn<F, S>> {

    @Override
    public List<Order> filter(List<Order> orders, FilterOn<F, S> filterOn) {
        List<Order> filteredByFirst = filterOn.firstFilter.filter(orders, filterOn.firstFilterCheck);
        List<Order> filteredBySecond = filterOn.secondFilter.filter(orders, filterOn.secondFilterCheck);

        for(Order order: filteredBySecond) {
            if(!filteredByFirst.contains(order)) {
                filteredByFirst.add(order);
            }
        }
        return filteredByFirst;
    }
}
