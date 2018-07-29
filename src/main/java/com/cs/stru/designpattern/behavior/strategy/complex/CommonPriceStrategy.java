package com.cs.stru.designpattern.behavior.strategy.complex;

@TotalPriceRange(min = 0,max = 5000)
public class CommonPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return price;
    }
}
