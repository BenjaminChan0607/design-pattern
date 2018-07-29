package com.cs.stru.designpattern.behavior.strategy.ultimate;

@TotalPriceRange(@PriceRange(min = 0, max = 5000, order = 99))
public class CommonPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return price;
    }
}
