package com.pattern.command.client;

import com.pattern.command.command.CeilingFanHighCommand;
import com.pattern.command.command.CeilingFanMediumCommand;
import com.pattern.command.command.CeilingFanOffCommand;
import com.pattern.command.command.Command;
import com.pattern.command.invoker.RemoteControlWithUndo;
import com.pattern.command.receiver.CeilingFanWithState;

public class RemoteLoaderWithStateUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFanWithState ceilingFan = new CeilingFanWithState("Living Room");

        Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        // 输出遥控列表
        System.out.println(remoteControl);

        // 测试按钮按键
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        // 撤回
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
