package com.cs.stru.designpattern.behavior.strategy.common;


public class PriceStrategyFactory {

    private PriceStrategyFactory() {

    }

    public static PriceStrategy getStrategy(Double price) {
        if (price >= 10000) {
            return new SuperVipPriceStrategy();
        } else if (price >= 5000) {
            return new VipPriceStrategy();
        } else {
            return new CommonPriceStrategy();
        }
    }
}
