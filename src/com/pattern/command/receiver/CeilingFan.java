package com.pattern.command.receiver;

public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " 打开");
    }

    public void off() {
        System.out.println(this.name + " 关闭");
    }

    public void dim() {
        System.out.println(this.name + " 调暗");
    }

    public String getName() {
        return name;
    }
}
