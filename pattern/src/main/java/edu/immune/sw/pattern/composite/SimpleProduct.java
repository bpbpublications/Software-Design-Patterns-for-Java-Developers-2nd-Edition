package edu.immune.sw.pattern.composite;

import java.util.Set;

public class SimpleProduct implements Product {
    private String name;
    private double price;
    private Set<String> deliverableLocations;

    public SimpleProduct(String name, double price, Set<String> deliverableLocations) {
        this.name = name;
        this.price = price;
        this.deliverableLocations = deliverableLocations;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isAvailable(String location) {
        return deliverableLocations.contains(location);
    }

    @Override
    public String toString() {
        return name + " (₹" + price + ")";
    }
}
