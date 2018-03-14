package com.pattern.command.client;

import com.pattern.command.command.*;
import com.pattern.command.invoker.RemoteControl;
import com.pattern.command.receiver.CeilingFan;
import com.pattern.command.receiver.GarageDoor;
import com.pattern.command.receiver.Light;
import com.pattern.command.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        // 遥控器
        RemoteControl remoteControl = new RemoteControl();

        // 具体实行的装置
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("CeilingFan");
        GarageDoor garageDoor = new GarageDoor("GarageDoor");
        Stereo stereo = new Stereo("Store");

        // 命令对象
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorDown = new GarageDoorDownCommand(garageDoor);
        Command stereoOnWithCD = new StereOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(4, garageDoorOpen, garageDoorDown);
        remoteControl.setCommand(5, stereoOnWithCD, stereoOff);

        // 打印遥控器的插槽和被指定的命令
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
