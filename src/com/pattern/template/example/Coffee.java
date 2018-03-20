package com.pattern.template.example;

/**
 * 咖啡
 */
public class Coffee extends CoffeineBeverage {


    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }


    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

}
