package com.pattern.factory.pizzaEnhance;

/**
 * 纽约披萨店
 */
public class NewYorkPizzaStore extends PizzaStore {

    // 制作适合纽约地区口味的披萨
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type))
            pizza = new NewYorkStyleCheesePizza();
        else if ("clam".equals(type))
            pizza = new NewYorkStyleClamPizza();
        else if ("veggie".equals(type))
            pizza = new NewYorkStyleVeggiePizza();

        return pizza;
    }
}
