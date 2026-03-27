package edu.immune.sw.pattern.observer.auction.obs;

import edu.immune.sw.pattern.observer.auction.Customer;

/**
 * Observer of Auction Event
 * 
 * @author Lalit Mehra
 * @since May 10, 2021
 */
public class Buyer implements Customer {

	@Override
	public void update(Object article) {
		System.out.println(article);
	}
	
//	@Override
//	public void update(Object article) {
//		Article artcl = (Article) article;
//		ArticleOnSale artosl = new ArticleOnSale(artcl);
//		BuyerViewController.refresh(artosl);
//	}

}
