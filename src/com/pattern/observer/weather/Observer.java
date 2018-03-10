package com.pattern.observer.weather;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 当气象观测值改变时更新
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    void update(float temp, float humidity, float pressure);

}
