package com.pattern.decorate.starbuckWithSize;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        price = 9.8;
        description = "首选咖啡";
    }

    @Override
    public String getDescription() {
        return this.description + "[" + getSize() + "](" + price + ")";
    }

    @Override
    public double cost() {
        return this.price;
    }
}
