package com.pattern.decorate.starbuck;

/**
 * 饮料实现类（被装饰者）
 */
public class Decaf extends Beverage {


    public Decaf() {
        price = .95;
        description = "无咖啡因咖啡";
    }

    @Override
    public double cost() {
        return price;
    }
}
