package com.pattern.command.command;

import com.pattern.command.receiver.TV;

public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        this.tv.off();
    }
}
