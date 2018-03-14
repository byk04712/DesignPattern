package com.pattern.command.command;

import com.pattern.command.receiver.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return this.stereo.getName() +  " " + this.getClass().getSimpleName();
    }
}
