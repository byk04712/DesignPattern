package com.pattern.facade.subsystem;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
    public void off() {}
    public void dim(int dim) {
        System.out.println("Theater Ceiling Lights dimming to " + dim + "%");
    }
}
