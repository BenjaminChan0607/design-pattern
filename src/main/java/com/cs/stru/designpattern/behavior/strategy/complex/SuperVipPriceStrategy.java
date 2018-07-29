package com.cs.stru.designpattern.behavior.strategy.complex;

@TotalPriceRange(min = 10000)
public class SuperVipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.5 * price;
    }
}
