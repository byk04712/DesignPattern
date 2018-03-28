package com.pattern.proxy.gumballproxy;

public class HasQuarterState implements State {

    private transient GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        if (machine.getCount() > 0)
            machine.setState(machine.getSoldState());
        else
            machine.setState(machine.getSoldOutState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Waiting for turn of crank";
    }
}
