package com.pattern.facade.subsystem;

public class Projector {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Top-O-Line Projector on");
    }
    public void off() {
        System.out.println("Top-O-Line Projector off");
    }
    public void tvMode() {}
    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }
}
