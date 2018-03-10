package com.pattern.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;

    private Subject weatherSubject;

    public StatisticsDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("=====   StatisticsDisplay " +  temperature + "F degrees   =========");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.display();
    }
}
