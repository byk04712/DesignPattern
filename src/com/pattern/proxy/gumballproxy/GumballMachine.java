package com.pattern.proxy.gumballproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;
    private State state = soldOutState;
    private int count;
    private String location;

    public GumballMachine(String location, int numberGumballs, int port) throws RemoteException {
        super(port);

        this.location = location;
        this.count = numberGumballs;

        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);

        if (this.count > 0)
            this.state = this.noQuarterState;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
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

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
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
