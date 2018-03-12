package com.pattern.factory.well.store;

import com.pattern.factory.well.pizza.ClamPizza;
import com.pattern.factory.well.pizza.VeggiePizza;
import com.pattern.factory.well.factory.NYPizzaIngredientFactory;
import com.pattern.factory.well.factory.PizzaIngredientFactory;
import com.pattern.factory.well.pizza.CheesePizza;
import com.pattern.factory.well.pizza.Pizza;

// 纽约pizza店
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        // 从纽约进购材料
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(factory);
            pizza.setName("New York Style Veggies Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
