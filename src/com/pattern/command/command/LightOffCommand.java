package com.pattern.command.command;

import com.pattern.command.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String toString() {
        return this.light.getName() +  " " + this.getClass().getSimpleName();
    }
}
