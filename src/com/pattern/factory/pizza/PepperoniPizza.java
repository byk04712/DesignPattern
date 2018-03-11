package com.pattern.factory.pizza;

public class PepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("意大利辣香肠比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("意大利辣香肠比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("意大利辣香肠比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("意大利辣香肠比萨打包");
    }
}
