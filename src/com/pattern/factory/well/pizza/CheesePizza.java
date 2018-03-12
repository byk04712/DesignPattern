package com.pattern.factory.well.pizza;

import com.pattern.factory.well.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();
        clams = factory.createClams();
        pepperoni = factory.createPepperoni();
    }
}
