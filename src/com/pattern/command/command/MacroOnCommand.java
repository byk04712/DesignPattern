package com.pattern.command.command;

/**
 * 命令宏，一组开的命令集合
 */
public class MacroOnCommand implements Command {

    private Command[] commands;

    public MacroOnCommand(Command[] commands) {
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
