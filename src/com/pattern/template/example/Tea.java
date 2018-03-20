package com.pattern.template.example;

/**
 * 茶
 */
public class Tea extends CoffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

}
