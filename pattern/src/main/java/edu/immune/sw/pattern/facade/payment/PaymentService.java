package edu.immune.sw.pattern.facade.payment;

import edu.immune.sw.pattern.facade.user.User;

public interface PaymentService {
	
	public PaymentOrder prepareOrder(PaymentMode payMode, double amount, User user);
	
	public PaymentResponse pay(PaymentOrder details);

}
