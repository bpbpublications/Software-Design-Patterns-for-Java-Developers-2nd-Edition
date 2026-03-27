package edu.immune.sw.pattern.observer.auction.obs;

import edu.immune.sw.pattern.observer.auction.Seller;

/**
 * Observer of Auction Event
 * 
 * @author Lalit Mehra
 * @since May 10, 2021
 */
public class Auctioneer implements Seller {

	@Override
	public void update(Object article) {
		System.out.println(article);
	}

}
