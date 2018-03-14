package com.pattern.command.receiver;

public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " 打开音响");
    }

    public void off() {
        System.out.println(this.name + " 关闭音箱");
    }

    public void setCd() {
        System.out.println(this.name + " 放置CD");
    }

    public void setDvd() {
        System.out.println(this.name + " 放置DVD");
    }

    public void setRadio() {
        System.out.println(this.name + " 设置收音机");
    }

    public void setVolume(int volume) {
        System.out.println(this.name + " 设置音量 " + volume);
    }

    public String getName() {
        return name;
    }
}
