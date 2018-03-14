package com.pattern.command.command;

import com.pattern.command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.on();
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return this.ceilingFan.getName() +  " " + this.getClass().getSimpleName();
    }
}
