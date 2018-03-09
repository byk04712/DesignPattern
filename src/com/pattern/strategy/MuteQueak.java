package com.pattern.strategy;

public class MuteQueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
