package edu.immune.sw.pattern.facade.user;

public class User {

	private boolean premiumMember;
	
	public void setPremiumMember(boolean premiumMember) {
		this.premiumMember = premiumMember;
	}
	
	public boolean isPremiumMember() {
		return premiumMember;
	}
	
}
