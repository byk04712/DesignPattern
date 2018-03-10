package com.pattern.decorate.starbuck;

/**
 * 浓缩咖啡（被装饰者）
 */
public class Espresso extends Beverage {

    public Espresso() {
        price = 1.99;
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return price;
    }
}
