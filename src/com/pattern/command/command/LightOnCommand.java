package com.pattern.command.command;

import com.pattern.command.receiver.Light;

/**
 * 实现厂商提供的类
 * 打开电灯的命令
 * 这是一个命令，所以要实现 Command 接口
 */
public class LightOnCommand implements Command {

    private Light light;

    /**
     * 构造器被传入了某个电灯（比如客厅的电灯），以便让这个命令控制
     * 然后记录在实例变量中，一旦调用execute就由这个电灯对象成为接收者，负责接收请求
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 这个execute方法调用接收对象（我们正在控制的电灯）的on方法
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    @Override
    public String toString() {
        return this.light.getName() +  " " + this.getClass().getSimpleName();
    }
}
