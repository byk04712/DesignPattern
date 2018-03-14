package com.pattern.command.command;

/**
 * 命令接口
 * 为所有命令声明了一个接口，调用命令对象的execute方法，就可以让接收者进行相关的动作，这个接口也具备一个undo方法
 */
public interface Command {

    /**
     * 执行命令
     */
    public void execute();

    /**
     * 取消
     */
    public void undo();
}
