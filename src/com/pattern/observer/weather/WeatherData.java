package com.pattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站提供的类
 */
public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 获取温度
     * @return
     */
    public float getTemperature() {
        return this.temperature;
    }

    /**
     * 获取湿度
     * @return
     */
    public float getHumidity() {
        return this.getHumidity();
    }

    /**
     * 获取压力
     * @return
     */
    public float getPressure() {
        return this.getPressure();
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged() {
        this.notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index != -1) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.humidity, this.pressure);
        }
    }
}
