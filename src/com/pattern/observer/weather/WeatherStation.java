package com.pattern.observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        // 实例化气象站对象
        WeatherData weatherData = new WeatherData();

        // 气象显示板
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForeastDisplay foreastDisplay = new ForeastDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
        HeadIndexDisplay headIndexDisplay = new HeadIndexDisplay(weatherData);

        // 模拟气象站数据更新
        weatherData.setMeasurements(74.4f,56,24.3f);
    }
}
