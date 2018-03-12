package com.pattern.factory.well.pizza;

import com.pattern.factory.well.cheese.Cheese;
import com.pattern.factory.well.clams.Clams;
import com.pattern.factory.well.dough.Dough;
import com.pattern.factory.well.pepperoni.Pepperoni;
import com.pattern.factory.well.sauce.Sauce;
import com.pattern.factory.well.veggies.Veggies;

/**
 * 比萨抽象类
 */
public abstract class Pizza {

    protected String name;

    // 比萨所需要的原料抽象类
    // 面团
    protected Dough dough;
    // 调味汁
    protected Sauce sauce;
    // 蔬菜
    protected Veggies[] veggies;
    // 奶酪
    protected Cheese cheese;
    // 香肠
    protected Pepperoni pepperoni;
    // 蛤蚌
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in offical PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String veggiesArr = "";
        for (int i = 0; i < veggies.length; i++) {
            veggiesArr += veggies[i] + ",";
        }
        if (veggiesArr.lastIndexOf(',') != -1) {
            veggiesArr = veggiesArr.substring(0, veggiesArr.length() - 1);
        }
        return "======== Pizza：" + name + "======== \n" +
                "{" +
                "    dough:" + dough + "\n" +
                "    sauce:" + sauce + "\n" +
                "    cheese:" + cheese + "\n" +
                "    pepperoni:" + pepperoni + "\n" +
                "    clams:" + clams + "\n" +
                "    veggies:[" + veggiesArr + "]" + "\n" +
                "}";
    }

}
