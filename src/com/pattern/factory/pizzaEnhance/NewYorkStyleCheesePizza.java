package com.pattern.factory.pizzaEnhance;

public class NewYorkStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("纽约奶酪比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("纽约奶酪比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("纽约奶酪比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("纽约奶酪比萨打包");
    }
}
