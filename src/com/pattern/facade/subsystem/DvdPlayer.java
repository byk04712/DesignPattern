package com.pattern.facade.subsystem;

public class DvdPlayer {

    private String movieName;
    private Amplifier amplifier;

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void pause() {

    }

    public void play(String movieName) {
        this.movieName = movieName;
        System.out.println("Top-O-Line DVD Player playing " + movieName);
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped " + this.movieName);
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

}
