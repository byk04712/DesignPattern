package com.pattern.proxy;

public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You returned but there's no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("you need pay first");
    }
}
