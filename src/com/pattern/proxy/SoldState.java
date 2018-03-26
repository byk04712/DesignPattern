package com.pattern.proxy;

public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, We are already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, You already returned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get another gumball");
    }

    @Override
    public void dispense() {
        machine.releaseGumball();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("Oops, Out of gumballs");
            machine.setState(machine.getSoldOutState());
        }
    }
}
