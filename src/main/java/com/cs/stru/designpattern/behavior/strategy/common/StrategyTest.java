package com.cs.stru.designpattern.behavior.strategy.common;

public class StrategyTest {

    private Double actualPrice;
    private PriceStrategy priceStrategy;
    private Double totalAmount = 0D;

    public void priceStrategy(Double price) {
        actualPrice = price;
        totalAmount += price;
        if (price >= 10000) {
            priceStrategy = new SuperVipPriceStrategy();
        } else if (price >= 5000) {
            priceStrategy = new VipPriceStrategy();
        } else {
            priceStrategy = new CommonPriceStrategy();
        }
        priceStrategy = PriceStrategyFactory.getStrategy(price);
    }

    public Double calcAmount() {
        return priceStrategy.calcPrice(actualPrice);
    }

    public static void main(String[] args) {
        StrategyTest strategyTest = new StrategyTest();
        strategyTest.priceStrategy(5000D);
        System.out.println(strategyTest.calcAmount());
    }
}
