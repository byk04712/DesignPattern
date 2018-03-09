package com.pattern.observer.sdk;

public class WeatherStation {
    public static void main(String[] args) {
        // 实例化气象站对象
        WeatherData weatherData = new WeatherData();

        // 气象板
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


        // 模拟气象站数据更新
        weatherData.setMeasurements(66.4f,24,62);


        weatherData.deleteObserver(statisticsDisplay);

        // 模拟气象站数据更新
        weatherData.setMeasurements(60.2f,34,55);
    }
}
