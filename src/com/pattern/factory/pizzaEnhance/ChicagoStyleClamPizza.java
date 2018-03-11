package com.pattern.factory.pizzaEnhance;

public class ChicagoStyleClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("芝加哥蛤蜊比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("芝加哥蛤蜊比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("芝加哥蛤蜊比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("芝加哥蛤蜊比萨打包");
    }
}
