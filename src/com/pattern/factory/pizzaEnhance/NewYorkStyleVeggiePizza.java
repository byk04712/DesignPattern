package com.pattern.factory.pizzaEnhance;

public class NewYorkStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("纽约素食比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("纽约素食比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("纽约素食比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("纽约素食比萨打包");
    }
}
