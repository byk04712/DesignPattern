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
        this.noQuarterState = new HasQuarterState(this);
        this.soldOutState = new HasQuarterState(this);
        this.soldState = new HasQuarterState(this);

        if (this.count > 0)
            this.state = this.noQuarterState;
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
}
