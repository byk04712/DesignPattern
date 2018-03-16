package com.pattern.facade;

import com.pattern.facade.subsystem.*;

public class HomeThreaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, lights, screen, popper);
        facade.watchMovie("Raiders of the Lost Ark");
        facade.endMovie();
    }
}
