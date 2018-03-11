package com.pattern.factory.pizzaEnhance;

public class ChicagoStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("芝加哥奶酪比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("芝加哥奶酪比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("芝加哥奶酪比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("芝加哥奶酪比萨打包");
    }
}
