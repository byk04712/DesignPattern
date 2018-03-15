package com.pattern.command.command;

import com.pattern.command.receiver.Hottub;

public class HottubOffCommand implements Command {

    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
