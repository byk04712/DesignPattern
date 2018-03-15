package com.pattern.command.client;

import com.pattern.command.command.*;
import com.pattern.command.invoker.RemoteControlWithUndo;
import com.pattern.command.receiver.Hottub;
import com.pattern.command.receiver.Light;
import com.pattern.command.receiver.Stereo;
import com.pattern.command.receiver.TV;

public class MacroControl {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 具体的操作实施者（机器）
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        Command livingRoomOn = new LightOnCommand(light);
        Command tvOn = new TVOnCommand(tv);
        Command stereoOn = new StereOnWithCDCommand(stereo);
        Command hottubOn = new HottubOnCommand(hottub);

        Command livingRoomOff = new LightOffCommand(light);
        Command tvOff = new TVOffCommand(tv);
        Command stereoOff = new StereoOffCommand(stereo);
        Command hottubOff = new HottubOffCommand(hottub);

        // 一组开的命令
        Command[] partyOn = { livingRoomOn, tvOn, stereoOn, hottubOn };
        // 一组关的命令
        Command[] partyOff = { livingRoomOff, tvOff, stereoOff, hottubOff };

        Command macroPartyOn = new MacroOnCommand(partyOn);
        Command macroPartyOff = new MacroOffCommand(partyOff);

        remoteControl.setCommand(0, macroPartyOn, macroPartyOff);

        System.out.println(remoteControl);
        System.out.println("-----------按下开按钮，一组命令执行-------------");
        remoteControl.onButtonWasPushed(0);

        System.out.println("\n\n-----------按下关按钮，一组命令执行-------------");
        remoteControl.offButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();
    }
}
