package com.pattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
