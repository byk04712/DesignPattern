package com.pattern.command.command;

import com.pattern.command.receiver.GarageDoor;

/**
 * 定义了动作和接收者之间的绑定关系，调用者只要调用execute就可以发出请求，然后调用接收者的一个或多个动作
 * Client
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

    @Override
    public String toString() {
        return this.garageDoor.getName() +  " " + this.getClass().getSimpleName();
    }
}
