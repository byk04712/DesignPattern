package com.pattern.status.gumballwithstate;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    // 加入winner 状态
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

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

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
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

    public State getWinnerState() {
        return winnerState;
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
