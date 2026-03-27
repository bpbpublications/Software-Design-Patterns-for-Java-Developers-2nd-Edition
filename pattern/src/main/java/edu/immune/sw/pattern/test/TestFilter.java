package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.filter.*;

import java.util.ArrayList;
import java.util.List;

import static edu.immune.sw.pattern.filter.OrderStatus.FULFILLED;
import static edu.immune.sw.pattern.filter.OrderStatus.IN_TRANSIT;

public class TestFilter {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1234", 1000d, FULFILLED));
        orders.add(new Order("3421", 1200.50d, IN_TRANSIT));
        orders.add(new Order("2341", 200.90d, IN_TRANSIT));

        System.out.printf("Application of simple filters. \nOrders: %s\n", orders);
        applyFilters(orders);

        System.out.printf("\nSequential application of filters. \nOrders: %s\n", orders);
        applyFiltersInSequence(orders);

        System.out.printf("\nApplication of logical filters. \nOrders: %s\n", orders);
        applyLogicalFilters(orders);
    }

    private static void applyFilters(List<Order> orders) {
        Filter<Order, OrderStatus> filterOnOrderStatus = new FilterOnOrderStatus();
        Filter<Order, Double> filterOnMinOrderVal = new FilterOnMinimumOrderValue();
        OrderStatus status = FULFILLED;
        double amount = 1000d;

        List<Order> filteredOrders = filterOnOrderStatus.filter(orders, status);
        System.out.printf("Filtered on Order status: %s \n", status);
        System.out.printf("Filtered Collection: %s\n", filteredOrders);

        filteredOrders = filterOnMinOrderVal.filter(orders, amount);
        System.out.printf("Filtered on minimum order value: %s \n", amount);
        System.out.printf("Filtered Collection: %s\n", filteredOrders);
    }

    private static void applyFiltersInSequence(List<Order> orders) {
        Filter<Order, OrderStatus> filterOnOrderStatus = new FilterOnOrderStatus();
        Filter<Order, Double> filterOnMinOrderVal = new FilterOnMinimumOrderValue();
        OrderStatus status = IN_TRANSIT;
        double amount = 500d;

        List<Order> filteredOrders = filterOnOrderStatus.filter(orders, status);
        System.out.printf("Filtered on Order status: %s \n", status);
        System.out.printf("Filtered Collection: %s\n", filteredOrders);

        filteredOrders = filterOnMinOrderVal.filter(filteredOrders, amount);
        System.out.printf("Filtered on minimum order value: %s \n", amount);
        System.out.printf("Filtered Collection: %s\n", filteredOrders);
    }

    private static void applyLogicalFilters(List<Order> orders) {
        Filter<Order, OrderStatus> filterOnOrderStatus = new FilterOnOrderStatus();
        Filter<Order, Double> filterOnMinOrderVal = new FilterOnMinimumOrderValue();

        FilterOn<OrderStatus, Double> andFilterOn = new FilterOn<>( filterOnOrderStatus,
                filterOnMinOrderVal, FULFILLED, 200d);

        FilterOn<OrderStatus, Double> orFilterOn = new FilterOn<>( filterOnOrderStatus,
                filterOnMinOrderVal, IN_TRANSIT, 1000d);

        Filter<Order, FilterOn<OrderStatus, Double>> andFilter = new AndFilter<>();
        Filter<Order, FilterOn<OrderStatus, Double>> orFilter = new OrFilter<>();

        List<Order> filteredOrders = andFilter.filter(orders, andFilterOn);
        System.out.println("Applying AND Filter");
        System.out.printf("Filtered Collection: %s\n", filteredOrders);

        filteredOrders = orFilter.filter(orders, orFilterOn);
        System.out.println("Applying OR Filter");
        System.out.printf("Filtered Collection: %s\n", filteredOrders);
    }

    private List<Order> filterOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1234", 1000d, FULFILLED));
        orders.add(new Order("3421", 1200.50d, IN_TRANSIT));
        orders.add(new Order("2341", 200.90d, IN_TRANSIT));

        Filter<Order, OrderStatus> filterOnOrderStatus = new FilterOnOrderStatus();
        Filter<Order, Double> filterOnMinOrderVal = new FilterOnMinimumOrderValue();

        List<Order> filteredOrders = filterOnOrderStatus.filter(orders, IN_TRANSIT);
        filteredOrders = filterOnMinOrderVal.filter(filteredOrders, 500d);
        return filteredOrders;
    }
}
