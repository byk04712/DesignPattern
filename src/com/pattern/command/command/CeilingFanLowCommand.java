package com.pattern.command.command;

import com.pattern.command.receiver.CeilingFanWithState;

public class CeilingFanLowCommand implements Command {

    private CeilingFanWithState ceilingFan;
    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFanWithState ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFanWithState.HIGH:
                ceilingFan.high();
                break;
            case CeilingFanWithState.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFanWithState.LOW:
                ceilingFan.low();
                break;
            case CeilingFanWithState.OFF:
                ceilingFan.off();
                break;
        }
    }

    @Override
    public String toString() {
        return ceilingFan.getLocation() + " " + this.getClass().getSimpleName();
    }
}
