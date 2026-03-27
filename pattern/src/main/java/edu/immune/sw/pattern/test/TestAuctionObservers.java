package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.observer.auction.ArticleRepository;
import edu.immune.sw.pattern.observer.auction.Auction;
import edu.immune.sw.pattern.observer.auction.Observer;
import edu.immune.sw.pattern.observer.auction.model.Article;
import edu.immune.sw.pattern.observer.auction.obs.Auctioneer;
import edu.immune.sw.pattern.observer.auction.obs.Buyer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Functional Test to verify Observer Design Patter functionality
 * 
 * @author Lalit Mehra
 * @since May 10, 2021
 * @see Auctioneer
 * @see Buyer
 * @see Auction3
 * @see AuctionSupervisor
 *
 */
public class TestAuctionObservers {

	public static void main(String[] args) {
		
		/* Initialise Observers */
		Observer auctioneer = new Auctioneer();
		
		List<Observer> buyers = new ArrayList<>();
		IntStream.range(0, 4).forEach(x -> buyers.add(new Buyer()));
		
		List<Article> articles = ArticleRepository.getArticles();

		/* Initialise Auction */
		Auction auction = new Auction(articles);
		auction.registerObserver(auctioneer);
		buyers.stream().forEach(x -> auction.registerObserver(x));
		auction.start();
		articles.stream().forEach(x -> auction.next());
		
	}

}
