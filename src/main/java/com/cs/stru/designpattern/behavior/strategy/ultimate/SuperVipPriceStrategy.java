package com.cs.stru.designpattern.behavior.strategy.ultimate;

@TotalPriceRange(@PriceRange(min = 10000, order = 99))
public class SuperVipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.5 * price;
    }
}
