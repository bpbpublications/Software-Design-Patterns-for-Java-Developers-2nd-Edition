package edu.immune.sw.pattern.template;

import edu.immune.sw.pattern.template.model.Order;
import edu.immune.sw.pattern.template.model.User;

public class BulkOrderProcessingService extends OrderProcessingService {

	public void prepareInvoice(User user, Order order) {
		System.out.println("preparing invoice for bulk order");
	}

	public void sendNotification(User user, Order order) {
		System.out.println("sending email to merchants");
		System.out.println("sending email to user");
	}

}