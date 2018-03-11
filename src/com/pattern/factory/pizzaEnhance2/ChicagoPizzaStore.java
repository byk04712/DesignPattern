package com.pattern.factory.pizzaEnhance2;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
