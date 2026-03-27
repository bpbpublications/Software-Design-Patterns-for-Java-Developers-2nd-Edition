package edu.immune.sw.pattern.filter;

public class Order {

    private String orderId;
    private Double orderValue;
    private OrderStatus orderStatus;

    public Order(String orderId, Double orderValue, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderValue = orderValue;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Double orderValue) {
        this.orderValue = orderValue;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderValue=" + orderValue +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
