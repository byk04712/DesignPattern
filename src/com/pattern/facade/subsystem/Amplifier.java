package com.pattern.facade.subsystem;

/**
 * 放大器
 */
public class Amplifier {

    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }

}
