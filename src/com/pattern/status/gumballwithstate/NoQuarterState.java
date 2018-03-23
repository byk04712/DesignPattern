package com.pattern.status.gumballwithstate;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        // 通过构造器将糖果对象记录在实例变量中
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 如果有人投了，则打印一条消息，同时将机器的状态改为 hasQuarter
        System.out.println("You inserted a quarter");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
