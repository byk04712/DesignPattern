package com.pattern.command.command;

/**
 * 宏命令，用来一键控制一系列命令
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++)
            this.commands[i].execute();
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++)
            this.commands[i].undo();
    }
}
