package com.pattern.observer.sdk;

import com.pattern.observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    public WeatherData weatherData;
    private float temperature;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("=====   StatisticsDisplay " +  temperature + "F degrees   =========");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.display();
        }
    }
}
