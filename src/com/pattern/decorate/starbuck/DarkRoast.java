package com.pattern.decorate.starbuck;

/**
 * 烘焙咖啡（被装饰者）（具体组件，代表一种饮料）
 */
public class DarkRoast extends Beverage {

    public  DarkRoast() {
        price = 1.52;
        description = "烘焙咖啡";
    }

    @Override
    public double cost() {
        return this.price;
    }
}
