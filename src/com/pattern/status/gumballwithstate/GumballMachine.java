package com.pattern.status.gumballwithstate;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);

        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnQuarter() {
        state.turnCrank();
        state.dispense();
    }

    /**
     * 这个机器提供一个 releaseBall 的辅助方法来释放出糖果，并将count实例变量的值减1
     */
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
