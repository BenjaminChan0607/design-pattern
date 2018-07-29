package com.cs.stru.designpattern.behavior.strategy.common;

public class CommonPriceStrategy implements PriceStrategy {
    public Double calcPrice(Double price) {
        return price;
    }
}
