package com.pattern.proxy;

public class GumballMachine {
    private State hasQuarterState;
    private State noQuarterState;
    private State soldState;
    private State soldOutState;
    private State state = soldOutState;
    // 记录位置
    private String location;
    private int count;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        if (count > 0)
            state = noQuarterState;
    }

    public void releaseGumball() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.count != 0) {
            this.count = this.count - 1;
        }
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void turnQuarter() {
        state.turnCrank();
        state.dispense();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nMighty Gumball, Inc.");
        sb.append("\nJava-enabled Standing Gumball Model #2004\n");
        sb.append("Inventory:" + count + " gumball");

        if (count != 1) {
            sb.append("s");
        }
        sb.append("\nMachine is ");
        if (state == soldOutState)
            sb.append("sold out");
        else if (state == noQuarterState)
            sb.append("waiting for quarter");
        else if (state == hasQuarterState)
            sb.append("waiting for turn of crank");
        else if (state == soldState)
            sb.append("delivering a gumball");

        sb.append("\n");
        return sb.toString();
    }
}
