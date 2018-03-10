package com.pattern.decorate.starbuck;

/**
 * 具体的饮料类（被装饰者）
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        price = .89;
        description = "首选咖啡";
    }

    @Override
    public double cost() {
        return price;
    }
}
