package com.pattern.decorate.starbuck;

/**
 * 调味品（装饰者） - 摩卡
 */
public class Mocha extends CondimentDecorator {

    //1. 用一个实例变量记录饮料，也就是被装饰者
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        price = .2;
        //2. 让被装饰者被记录到实例变量中
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        // 0.2 表示该调味品的价格
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 摩卡(调味品" + price + ")";
    }
}
