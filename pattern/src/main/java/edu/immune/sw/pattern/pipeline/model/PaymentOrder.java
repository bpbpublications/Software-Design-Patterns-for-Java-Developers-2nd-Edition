package edu.immune.sw.pattern.pipeline.model;

public class PaymentOrder {

    private String payOrderId;

    private Order order;

    public PaymentOrder(Order order) {
        this.order = order;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public Order getOrder() {
        return order;
    }

}
