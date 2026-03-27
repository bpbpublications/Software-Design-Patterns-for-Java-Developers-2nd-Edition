package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.template.BulkOrderProcessingService;
import edu.immune.sw.pattern.template.OrderProcessingService;
import edu.immune.sw.pattern.template.RetailOrderProcessingService;
import edu.immune.sw.pattern.template.model.Order;
import edu.immune.sw.pattern.template.model.User;

public class TestTemplateMethod {
	
	public static void main(String[] args) {
		Order order = new Order();
		User user = new User();
		
		OrderProcessingService bulk = new BulkOrderProcessingService();
		OrderProcessingService retail = new RetailOrderProcessingService();
		
		bulk.process(order, user);
		System.out.println();
		retail.process(order, user);
	}

}
