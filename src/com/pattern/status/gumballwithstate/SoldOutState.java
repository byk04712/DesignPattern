package com.pattern.status.gumballwithstate;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        // 通过构造器将糖果对象记录在实例变量中
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter, The gumball machine sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, You haven't insert quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You returned but there's no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
