package com.pattern.decorate.starbuck;

/**
 * 调味品（装饰者） - 牛奶
 */
public class Milk extends CondimentDecorator {

    // 饮料
    private Beverage beverage;

    public Milk(Beverage beverage) {
        price = .1;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 牛奶(调味品" + price + ")";
    }
}
