package com.pattern.facade.subsystem;

/**
 * 调音器
 */
public class Tuner {

    private Amplifier amplifier;

    public void on() {
        System.out.println("打开调音器");
    }

    public void off() {
        System.out.println("关闭调音器");
    }

    public void setAm(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void setFm() {

    }

    public void setFrequency() {

    }

}
