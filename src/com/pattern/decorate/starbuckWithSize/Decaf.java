package com.pattern.decorate.starbuckWithSize;

public class Decaf extends Beverage{

    public Decaf() {
        price = .95;
        description = "无咖啡因咖啡";
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
