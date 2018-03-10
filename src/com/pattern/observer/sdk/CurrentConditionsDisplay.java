package com.pattern.observer.sdk;

import com.pattern.observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("==== Current conditions：" + temperature + " F degrees and " + humidity + "% humidity  ====");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
}
