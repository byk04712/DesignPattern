package com.pattern.compound;

/**
 * 观察者模式
 * observable为被观察者
 */
public interface QuackObservable {
    // 注册观察者
    public void registerObserver(Observer observer);
    // 通知观察者
    public void notifyObservers();
}
