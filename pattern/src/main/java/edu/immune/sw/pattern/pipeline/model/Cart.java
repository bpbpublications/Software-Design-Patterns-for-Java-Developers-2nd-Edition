package edu.immune.sw.pattern.pipeline.model;

import java.util.List;

public class Cart {

    private User user;
    private List<Article> articles;

    public User getUser() {
        return user;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "Articles: [Name: The Compound Effect, Category: Book]";
    }
}
