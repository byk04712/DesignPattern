package com.pattern.decorate.starbuck;

/**
 * 调味品（装饰者） - 奶泡
 */
public class Whip extends CondimentDecorator {

    // 被装饰者
    private Beverage beverage;

    public Whip(Beverage beverage) {
        price = .4;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 奶泡(调味品" + price + ")";
    }
}
