package com.pattern.command.command;

public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "";
    }
}
