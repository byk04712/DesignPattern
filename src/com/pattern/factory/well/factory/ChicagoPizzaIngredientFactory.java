package com.pattern.factory.well.factory;

import com.pattern.factory.well.cheese.Cheese;
import com.pattern.factory.well.cheese.Mozzarella;
import com.pattern.factory.well.clams.Clams;
import com.pattern.factory.well.clams.FrozenClams;
import com.pattern.factory.well.dough.Dough;
import com.pattern.factory.well.dough.ThickCrustDough;
import com.pattern.factory.well.pepperoni.Pepperoni;
import com.pattern.factory.well.pepperoni.SlicedPepperoni;
import com.pattern.factory.well.sauce.PlumTomatoSauce;
import com.pattern.factory.well.sauce.Sauce;
import com.pattern.factory.well.veggies.BlackOlives;
import com.pattern.factory.well.veggies.EggPlant;
import com.pattern.factory.well.veggies.Spinach;
import com.pattern.factory.well.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
