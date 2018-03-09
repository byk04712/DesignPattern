package com.pattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
