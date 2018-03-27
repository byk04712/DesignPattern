package com.pattern.proxy.gumball;

public class SoldOutState implements State {

    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert Quarter, The gumball machine sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You returned but there's no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
