package edu.immune.sw.pattern.pipeline.service;

import edu.immune.sw.pattern.pipeline.model.Order;
import edu.immune.sw.pattern.pipeline.model.PaymentOrder;

public class PaymentService {

    public PaymentOrder pay(Order order) {
        return new PaymentOrder(order);
    }
}
