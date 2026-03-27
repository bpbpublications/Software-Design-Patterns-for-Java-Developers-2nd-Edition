package edu.immune.sw.pattern.filter;

public class FilterOn<F, S>{

    Filter<Order, F> firstFilter;
    Filter<Order, S> secondFilter;

    F firstFilterCheck;

    S secondFilterCheck;

    public FilterOn(Filter<Order, F> firstFilter, Filter<Order, S> secondFilter, F firstFilterCheck, S secondFilterCheck) {
        this.firstFilter = firstFilter;
        this.secondFilter = secondFilter;
        this.firstFilterCheck = firstFilterCheck;
        this.secondFilterCheck = secondFilterCheck;
    }
}
