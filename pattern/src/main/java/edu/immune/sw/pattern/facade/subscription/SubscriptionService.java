package edu.immune.sw.pattern.facade.subscription;

import edu.immune.sw.pattern.facade.user.User;

public interface SubscriptionService {

	public double getSubscriptionCharge();
	
	public void subscribe(User user);
	
	public void unsubscribe(User user);
	
}
