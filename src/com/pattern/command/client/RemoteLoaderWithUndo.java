package com.pattern.command.client;

import com.pattern.command.command.Command;
import com.pattern.command.command.LightOffCommand;
import com.pattern.command.command.LightOnCommand;
import com.pattern.command.invoker.RemoteControlWithUndo;
import com.pattern.command.receiver.Light;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        Command livingRoomOn = new LightOnCommand(livingRoomLight);
        Command livingRoomOff = new LightOffCommand(livingRoomLight);

        remoteControlWithUndo.setCommand(0, livingRoomOn, livingRoomOff);

        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
