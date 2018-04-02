package com.pattern.compound;

/**
 * 观察者实现
 */
public class Quacklogist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist：" + duck + " just quacked.");
    }
}
