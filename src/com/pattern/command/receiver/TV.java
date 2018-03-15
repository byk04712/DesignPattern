package com.pattern.command.receiver;

public class TV {
    private String location;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " 电视打开");
    }
    public void off(){
        System.out.println(location + " 电视关闭");
    }
    public void setInputChannel(int channelNumber){
        System.out.println(location + " 电视频道切换 " + channelNumber);
    }
    public void setVolume(int volume){
        System.out.println(location + " 电视设置音量 " + volume);
    }
}
