package com.pattern.command.command;

import com.pattern.command.receiver.TV;

public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
