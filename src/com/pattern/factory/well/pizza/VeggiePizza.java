package com.pattern.factory.well.pizza;

import com.pattern.factory.well.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory factory;

    public VeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        sauce = factory.createSauce();
        dough = factory.createDough();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();
        clams = factory.createClams();
        pepperoni = factory.createPepperoni();
    }
}
