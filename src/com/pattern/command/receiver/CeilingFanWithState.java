package com.pattern.command.receiver;

/**
 * 使用状态实现撤销功能
 */
public class CeilingFanWithState {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFanWithState(String location) {
        this.location = location;
        speed = OFF;
    }

    public void setHigh() {
        this.speed = HIGH;
    }

    public void setMedium() {
        this.speed = MEDIUM;
    }

    public void setLow() {
        this.speed = LOW;
    }

    public void setOff() {
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void high() {
        this.setHigh();
    }

    public void medium() {
        this.setMedium();
    }

    public void low() {
        this.setLow();
    }

    public void off() {
        this.setOff();
    }

}
