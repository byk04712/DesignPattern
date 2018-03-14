package com.pattern.command.receiver;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " 开灯");
    }

    public void off() {
        System.out.println(this.name + " 关灯");
    }

    public String getName() {
        return name;
    }
}
