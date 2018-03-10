package com.pattern.decorate.starbuckWithSize;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        if (beverage.getSize() == Size.Tall) {
            price = .1;
        } else if (beverage.getSize() == Size.Grande) {
            price = .15;
        } else  if (beverage.getSize() == Size.Venti) {
            price = .2;
        }
        description = " + 豆浆(" + price + ")";
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
