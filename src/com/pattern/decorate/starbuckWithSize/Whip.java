package com.pattern.decorate.starbuckWithSize;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
        if (beverage.getSize() == Size.Tall) {
            price = 0.15;
        } else if (beverage.getSize() == Size.Grande) {
            price = 0.2;
        } else if (beverage.getSize() ==  Size.Venti) {
            price = 0.25;
        }
        description = " + 奶泡（" + price + "）";
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
