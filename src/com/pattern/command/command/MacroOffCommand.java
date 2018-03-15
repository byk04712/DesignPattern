package com.pattern.command.command;

/**
 * 命令宏，一组关的命令集合
 */
public class MacroOffCommand implements Command {

    private Command[] commands;

    public MacroOffCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
