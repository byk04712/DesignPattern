package com.pattern.factory.well.factory;

import com.pattern.factory.well.cheese.Cheese;
import com.pattern.factory.well.cheese.ReggianoCheese;
import com.pattern.factory.well.clams.Clams;
import com.pattern.factory.well.clams.FreshClams;
import com.pattern.factory.well.dough.Dough;
import com.pattern.factory.well.dough.ThinCrustDough;
import com.pattern.factory.well.pepperoni.Pepperoni;
import com.pattern.factory.well.pepperoni.SlicedPepperoni;
import com.pattern.factory.well.sauce.MarinaraSauce;
import com.pattern.factory.well.sauce.Sauce;
import com.pattern.factory.well.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
