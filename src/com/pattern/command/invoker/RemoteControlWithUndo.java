package com.pattern.command.invoker;

import com.pattern.command.command.Command;
import com.pattern.command.command.NoCommand;

public class RemoteControlWithUndo {

    private static int cmdSize = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[cmdSize];
        offCommands = new Command[cmdSize];
        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < cmdSize; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    /**
     * 遥控器上的撤销按钮被点击
     */
    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("---------- Remote Control ----------\n");
        for (int i = 0; i < cmdSize; i++) {
            buffer.append("[slot " + i + "  on：" + this.onCommands[i] + "   off：" + this.offCommands[i] + "]\n");
        }
        return buffer.toString();
    }

}
