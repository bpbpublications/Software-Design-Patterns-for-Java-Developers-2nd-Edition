package edu.immune.sw.pattern.pipeline.model;

import java.util.List;

public class Order {

    private String orderId;
    private User user;

    private List<Article> articles;

    public Order(Cart cart) {
        this.articles = cart.getArticles();
        this.user = cart.getUser();
    }

    public String getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "Order [Order Id: #FDR43545, Articles: [Name: The Compound Effect, Category: Book]]";
    }
}
