package com.pattern.observer.sdk;

import java.util.Observable;

/**
 * 使用 java.util 内置的监听者接口和类重写气象站
 * 1。继承 java.util.Observable
 * 2。我们不再需要追踪观察者了，也不再需要管理注册和删除（让父类代劳）
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        // 注意每次在调用 notifyObservers 之前要先调用 setChanged 来表示状态已经被改变，可进入父类查看代码。
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
