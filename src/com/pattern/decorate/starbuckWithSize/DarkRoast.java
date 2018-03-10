package com.pattern.decorate.starbuckWithSize;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        price = 1.52;
        description = "烘焙咖啡";
    }

    @Override
    public String getDescription() {
        return this.description + "[" + getSize() + "](" + price + ")";
    }

    @Override
    public double cost() {
        return price;
    }

}
