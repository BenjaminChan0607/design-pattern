package com.cs.stru.designpattern.behavior.strategy.common;

public class SuperVipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.5 * price;
    }
}
