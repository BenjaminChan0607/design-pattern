package com.cs.stru.designpattern.behavior.strategy.ultimate;

@OncePriceRange(@PriceRange(min = 10000, order = 10))
public class ActivityTwoStrategy implements PriceStrategy {


    public Double calcPrice(Double price) {
        return price - 2000;
    }
}
