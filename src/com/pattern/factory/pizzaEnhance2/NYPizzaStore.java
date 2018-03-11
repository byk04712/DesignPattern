package com.pattern.factory.pizzaEnhance2;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
