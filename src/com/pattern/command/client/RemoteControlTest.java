package com.pattern.command.client;

import com.pattern.command.command.Command;
import com.pattern.command.command.GarageDoorOpenCommand;
import com.pattern.command.command.LightOnCommand;
import com.pattern.command.invoker.SimpleRemoteControl;
import com.pattern.command.receiver.GarageDoor;
import com.pattern.command.receiver.Light;

/**
 * 命令模式的客户
 * 负责创建一个 Command 并设置其接收者
 */
public class RemoteControlTest {
    public static void main(String[] args) {

        // 遥控器就是一个调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        // 现在创建一个电灯对象，此对象也就是请求接收者
        Light light = new Light("Kitchen");

        // 在这里创建了一个命令，然后将接收者传给他
        Command lightOnCmd = new LightOnCommand(light);

        // 把命令传给调用者
        remoteControl.setCommand(lightOnCmd);

        // 模拟按下按钮
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("Garage");

        Command garageDoorCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorCommand);

        remoteControl.buttonWasPressed();
    }
}
