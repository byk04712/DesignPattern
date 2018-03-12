package com.pattern.factory.well.store;

import com.pattern.factory.well.factory.ChicagoPizzaIngredientFactory;
import com.pattern.factory.well.factory.PizzaIngredientFactory;
import com.pattern.factory.well.pizza.CheesePizza;
import com.pattern.factory.well.pizza.ClamPizza;
import com.pattern.factory.well.pizza.Pizza;
import com.pattern.factory.well.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(factory);
            pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}
