package edu.immune.sw.pattern.observer.auction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import edu.immune.sw.pattern.observer.auction.model.Article;

public class ArticleRepository {

	public static List<Article>  getArticles() {
		List<Article> articles = new ArrayList<>();
		IntStream.range(0, 6).forEach(x -> articles.add(new Article()));
		return articles;
	}
	
}
