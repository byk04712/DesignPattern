package com.pattern.command.invoker;

import com.pattern.command.command.Command;
import com.pattern.command.command.NoCommand;

/**
 * 遥控器，处理7个开与关的命令
 */
public class RemoteControl {
    private static int cmdSize = 7;

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[cmdSize];
        this.offCommands = new Command[cmdSize];

        // 遥控器出厂的时候是没有命令的，所以给个不执行任何命令的空对象
        Command noCommand = new NoCommand();
        for (int i = 0; i < cmdSize; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置对应插槽的命令
     * @param slot 遥控器插槽的位置
     * @param onCmd 开的命令
     * @param offCmd 关的命令
     */
    public void setCommand(int slot, Command onCmd, Command offCmd) {
        this.onCommands[slot] = onCmd;
        this.offCommands[slot] = offCmd;
    }

    /**
     * 遥控器上第几个按钮的开命令
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    /**
     * 遥控器上第几个按钮的关命令
     * @param slot
     */
    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
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
