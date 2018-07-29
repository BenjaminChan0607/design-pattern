package com.cs.stru.designpattern.behavior.strategy.ultimate;

@TotalPriceRange(@PriceRange(min = 5000, max = 10000, order = 99))
public class VipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.8 * price;
    }
}
