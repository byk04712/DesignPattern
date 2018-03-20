package com.pattern.template.example;

/**
 * 咖啡因饮料
 */
public abstract class CoffeineBeverage {

    /**
     * 准备饮料(模版方法)
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 添加其他调味品
     */
    protected abstract void addCondiments();

    /**
     * 倒入杯中
     */
    public void pourInCup() {
        System.out.println("Pouring in Cup");
    }

    /**
     * 冲泡
     */
    public abstract void brew();

    /**
     * 将水煮沸
     */
    public void boilWater() {
        System.out.println("Boiling Water");
    }

}
