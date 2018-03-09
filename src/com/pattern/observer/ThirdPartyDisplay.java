package com.pattern.observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    private Subject weatherSubject;

    public ThirdPartyDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("===                      其他用户要显示的观测板                 =====");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.display();
    }
}
