package com.pattern.command.receiver;

/**
 * 接收者知道如何进行必要的工作，实现这个请求。任何类都可以当接收者
 * Receiver
 */
public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.name + " is Open");
    }

    public void down() {
        System.out.println(this.name + " down");
    }

    public void stop() {
        System.out.println(this.name + " stop");
    }

    public void lightOn() {
        System.out.println(this.name + " lightOn");
    }

    public void lightOff() {
        System.out.println(this.name + " lightOff");
    }

    public String getName() {
        return name;
    }
}
