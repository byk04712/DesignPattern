package com.pattern.decorate.starbuck;

/**
 * 调味品（装饰者） - 豆浆
 */
public class Soy extends CondimentDecorator {

    // 被装饰者
    private Beverage beverage;

    public Soy(Beverage beverage) {
        price = 1.1;
        this.beverage = beverage;
    }

    /**
     * 返回饮料 + 调味品的价格
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 豆浆(调味品" + price + ")";
    }
}
