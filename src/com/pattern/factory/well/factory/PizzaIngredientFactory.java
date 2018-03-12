package com.pattern.factory.well.factory;

import com.pattern.factory.well.cheese.Cheese;
import com.pattern.factory.well.clams.Clams;
import com.pattern.factory.well.dough.Dough;
import com.pattern.factory.well.pepperoni.Pepperoni;
import com.pattern.factory.well.sauce.Sauce;
import com.pattern.factory.well.veggies.Veggies;

/**
 * 原料工厂
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
