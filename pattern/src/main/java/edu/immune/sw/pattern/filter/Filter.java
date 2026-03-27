package edu.immune.sw.pattern.filter;

import java.util.List;

public interface Filter<K, T> {

    List<K> filter(List<K> input, T filterOn);

}
