package com.pattern.observer.weather;

public class ForeastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForeastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("====== 显示天气预报 temperture " + temperature + " F degrees =======");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
