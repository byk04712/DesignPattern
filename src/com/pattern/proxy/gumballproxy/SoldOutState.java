package com.pattern.proxy.gumballproxy;

public class SoldOutState implements State {

    private transient GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
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

    @Override
    public String toString() {
        return "Sold out";
    }
}
