package com.pattern.observer.weather;

/**
 * 主题/通知 接口
 */
public interface Subject {

    /**
     * 注册观察者（订阅）
     * @param observer 传入一个观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者（取消订阅）
     * @param observer 要移除的观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 当 Subject 状态改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObserver();
}
