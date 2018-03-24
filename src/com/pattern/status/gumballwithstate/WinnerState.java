package com.pattern.status.gumballwithstate;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    private WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("You're a winner! You get two gumballs for your quarter");
        this.gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            this.gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                this.gumballMachine.setState(this.gumballMachine.getNoQuarter());
            } else {
                this.gumballMachine.setState(this.gumballMachine.getSoldOutQuarterState());
                System.out.println("Oops, out of gumballs!");
            }
        } else {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutQuarterState());
        }
    }
}
