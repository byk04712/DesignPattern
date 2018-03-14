package com.pattern.command.receiver;

/**
 * 接收者知道如何进行必要的工作，实现这个请求。任何类都可以当接收者
 * Receiver
 */
public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("GarageDoor down");
    }

    public void stop() {
        System.out.println("GarageDoor stop");
    }

    public void lightOn() {
        System.out.println("GarageDoor lightOn");
    }

    public void lightOff() {
        System.out.println("GarageDoor lightOff");
    }
}
