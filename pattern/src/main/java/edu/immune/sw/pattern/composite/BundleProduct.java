package edu.immune.sw.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class BundleProduct implements Product {
    private String name;
    private List<Product> products = new ArrayList<>();
    private double discountPercentage; // e.g., 10 for 10%

    public BundleProduct(String name) {
        this(name, 0.0);
    }

    public BundleProduct(String name, double discountPercentage) {
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public double getPrice() {
        double total = products.stream()
                               .mapToDouble(Product::getPrice)
                               .sum();
        if (discountPercentage > 0) {
            total -= total * (discountPercentage / 100);
        }
        return total;
    }

    @Override
    public boolean isAvailable(String location) {
        // A bundle is available only if ALL products are available
        return products.stream().allMatch(p -> p.isAvailable(location));
    }

    @Override
    public String toString() {
        return "Bundle: " + name + 
               (discountPercentage > 0 ? " (Discount: " + discountPercentage + "%)" : "");
    }
}
