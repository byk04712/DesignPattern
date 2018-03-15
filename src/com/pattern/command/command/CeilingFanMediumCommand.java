package com.pattern.command.command;

import com.pattern.command.receiver.CeilingFanWithState;

/**
 * 风扇中速运行
 */
public class CeilingFanMediumCommand implements Command {

    private CeilingFanWithState ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFanWithState ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // 先记录下当前的速度，然后在运行
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
