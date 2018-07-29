package com.cs.stru.designpattern.behavior.strategy.complex;

@TotalPriceRange(min = 5000,max = 10000)
public class VipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.8 * price;
    }
}
