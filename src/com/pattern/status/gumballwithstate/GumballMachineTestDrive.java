package com.pattern.status.gumballwithstate;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();

        System.out.println(gumballMachine);
    }
}
