package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.composite.BundleProduct;
import edu.immune.sw.pattern.composite.Product;
import edu.immune.sw.pattern.composite.SimpleProduct;

import java.util.Set;

public class TestComposite {
    public static void main(String[] args) {
        // Simple products
        Product phone = new SimpleProduct("Mobile", 20000, Set.of("Delhi", "Pune"));
        Product charger = new SimpleProduct("Charger", 1500, Set.of("Delhi", "Mumbai"));
        Product book = new SimpleProduct("Book", 2000, Set.of("Pune", "Mumbai"));

        // Bundle 1: Phone + Charger (10% discount)
        BundleProduct phoneBundle = new BundleProduct("Phone Combo", 10);
        phoneBundle.addProduct(phone);
        phoneBundle.addProduct(charger);

        // Bundle 2: PhoneBundle + Earphones (5% discount)
        BundleProduct megaBundle = new BundleProduct("Mega Combo", 5);
        megaBundle.addProduct(phoneBundle);
        megaBundle.addProduct(book);

        // Print details
        printProductDetails(phone, "Delhi");
        printProductDetails(phoneBundle, "Delhi");
        printProductDetails(megaBundle, "Delhi");

        System.out.println("---- Testing Availability in Mumbai ----");
        printProductDetails(phoneBundle, "Mumbai");
        printProductDetails(megaBundle, "Mumbai");
    }

    private static void printProductDetails(Product product, String location) {
        System.out.println(product + " | Price: ₹" + product.getPrice() +
            " | Available in " + location + "? " + product.isAvailable(location));
    }
}
