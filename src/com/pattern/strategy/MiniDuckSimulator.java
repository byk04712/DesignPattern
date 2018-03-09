package com.pattern.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQueak();

        mallard.setQuackBehavior(new Quack());
        mallard.performQueak();

        Duckcall duckcall = new Duckcall(new Quack());
        duckcall.performQueak();
        duckcall.setQuackBehavior(new Squeak());
        duckcall.performQueak();
    }
}
