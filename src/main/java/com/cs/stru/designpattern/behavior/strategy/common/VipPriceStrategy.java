package com.cs.stru.designpattern.behavior.strategy.common;

public class VipPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return 0.8 * price;
    }
}
