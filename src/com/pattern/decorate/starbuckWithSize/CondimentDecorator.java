package com.pattern.decorate.starbuckWithSize;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
        super.setSize(beverage.getSize());
    }

}
