package com.pattern.factory.pizza;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
