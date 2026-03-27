package edu.immune.sw.pattern.pipeline;

import edu.immune.sw.pattern.pipeline.model.Order;
import edu.immune.sw.pattern.pipeline.model.PaymentOrder;
import edu.immune.sw.pattern.pipeline.service.PaymentService;

public class PaymentFulfillmentTask implements Task<Order, PaymentOrder> {

    private final PaymentService paymentService = new PaymentService();

    @Override
    public PaymentOrder execute(Order order) {
        System.out.println("Initiating Payment");
        return paymentService.pay(order);
    }
}
