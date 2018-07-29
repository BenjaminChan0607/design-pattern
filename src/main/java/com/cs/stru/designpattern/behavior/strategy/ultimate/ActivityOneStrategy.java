package com.cs.stru.designpattern.behavior.strategy.ultimate;

@OncePriceRange(@PriceRange(min = 5000,max = 10000,order = 10))
public class ActivityOneStrategy implements PriceStrategy{


    public Double calcPrice(Double price) {
        return price - 1000;
    }
}
