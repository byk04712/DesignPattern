package com.pattern.factory.pizzaEnhance;

/**
 * 芝加哥 披萨店
 */
public class ChicagoPizzaStore extends PizzaStore{

    // 制作适合 芝加哥 地区口味的披萨
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type))
            pizza = new ChicagoStyleCheesePizza();
        else if ("clam".equals(type))
            pizza = new ChicagoStyleClamPizza();
        else if ("veggie".equals(type))
            pizza = new ChicagoStyleVeggiePizza();

        return pizza;
    }
}
