package com.pattern.factory.pizzaEnhance;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        if ("cheese".equals(type))
            pizza = new CaliforniaStyleCheesePizza();
        else if ("veggie".equals(type))
            pizza = new CaliforniaStyleVeggiePizza();
        else if ("clam".equals(type))
            pizza = new CaliforniaStyleClamPizza();

        return pizza;
    }
}
