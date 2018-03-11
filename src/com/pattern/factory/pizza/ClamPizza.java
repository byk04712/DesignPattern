package com.pattern.factory.pizza;

public class ClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("蛤蜊比萨准备阶段");
    }

    @Override
    public void bake() {
        System.out.println("蛤蜊比萨制作阶段");
    }

    @Override
    public void cut() {
        System.out.println("蛤蜊比萨切片阶段");
    }

    @Override
    public void box() {
        System.out.println("蛤蜊比萨打包");
    }
}
