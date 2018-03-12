package com.pattern.factory.well.store;

import com.pattern.factory.well.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza);
    }

    abstract Pizza createPizza(String type);

}
