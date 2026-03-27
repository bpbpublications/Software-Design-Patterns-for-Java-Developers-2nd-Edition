package edu.immune.sw.pattern.template;

import edu.immune.sw.pattern.template.model.Order;
import edu.immune.sw.pattern.template.model.User;

public class RetailOrderProcessingService extends OrderProcessingService {

	public void prepareInvoice(User user, Order order) {
		System.out.println("preparing invoice for the user");
	}

	public void sendNotification(User user, Order order) {
		System.out.println("notifying user via sms");
	}
	
	public void confirmOrder(Order order) {
		System.out.println("verifying payment status");
		super.confirmOrder(order);
	}

}
