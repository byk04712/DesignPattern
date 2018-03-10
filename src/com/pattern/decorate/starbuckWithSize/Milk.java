package com.pattern.decorate.starbuckWithSize;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);

        if (beverage.getSize() == Size.Tall) {
            price = .8;
        } else if (beverage.getSize() == Size.Grande) {
            price = 1.3;
        } else if (beverage.getSize() == Size.Venti) {
            price = 1.8;
        }
        description = " + 牛奶(" + price + ")";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }
}
