package edu.immune.sw.pattern.pipeline;

import edu.immune.sw.pattern.pipeline.model.Order;
import edu.immune.sw.pattern.pipeline.model.PaymentOrder;
import edu.immune.sw.pattern.pipeline.service.NotificationService;
import edu.immune.sw.pattern.pipeline.util.NotificationMessageUtil;

public class NotificationTask implements Task<PaymentOrder, Order> {

    private final NotificationService notificationService = new NotificationService();

    @Override
    public Order execute(PaymentOrder paymentOrder) {
        System.out.println("Notifying User");
        sendNotification(paymentOrder.getOrder());
        return paymentOrder.getOrder();
    }

    private void sendNotification(Order order) {
        String message = NotificationMessageUtil.getMessage(order.getOrderId(), order.getUser());
        notificationService.sendNotification(message);
    }

}
