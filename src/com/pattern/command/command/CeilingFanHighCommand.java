package com.pattern.command.command;

import com.pattern.command.receiver.CeilingFanWithState;

public class CeilingFanHighCommand implements Command {

    private CeilingFanWithState ceilingFan;
    // 记录之前的速度
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFanWithState ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // 在我们改变吊扇的速度之前，先把速度记录下来，以便撤销时候用到
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            // 上一次的速度如果是高度，则调用高速
            case CeilingFanWithState.HIGH:
                ceilingFan.high();
                break;
            // 上一次的速度如果是中度，则调用中速
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
}
