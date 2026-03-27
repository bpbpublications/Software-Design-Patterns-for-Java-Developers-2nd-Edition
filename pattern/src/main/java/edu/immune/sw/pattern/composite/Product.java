package edu.immune.sw.pattern.composite;

import java.util.Set;

public interface Product {
    double getPrice();
    boolean isAvailable(String location);
}
