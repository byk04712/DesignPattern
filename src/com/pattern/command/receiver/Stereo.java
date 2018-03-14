package com.pattern.command.receiver;

public class Stereo {
    public void on() {
        System.out.println("打开音响");
    }

    public void off() {
        System.out.println("关闭音箱");
    }

    public void setCd() {
        System.out.println("放置CD");
    }

    public void setDvd() {
        System.out.println("放置DVD");
    }

    public void setRadio() {
        System.out.println("设置收音机");
    }

    public void setVolume(int volume) {
        System.out.println("设置音量 " + volume);
    }
}
