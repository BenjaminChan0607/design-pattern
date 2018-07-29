package com.cs.stru.designpattern.behavior.strategy.ultimate;

import lombok.Data;

@Data
public class Client {
    private Double amount = 0D;
    private PriceStrategy priceStrategy;
    private Double totalAmount = 0D;

    public void priceStrategy(Double price) {
        amount = price;
        totalAmount += price;
        if (price >= 10000) {
            priceStrategy = new SuperVipPriceStrategy();
        } else if (price >= 5000) {
            priceStrategy = new VipPriceStrategy();
        } else {
            priceStrategy = new CommonPriceStrategy();
        }
    }

    public Double calcAmount() {
        return priceStrategy.calcPrice(amount);
    }

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Double price = 12000D;
        Client client = new Client();
        client.priceStrategy(price);
        Double amount = PriceStrategyFactory.getInstance().getPriceStrategy(client).calcPrice(price);
        System.out.println(amount);
    }
}
