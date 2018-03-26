package com.pattern.status.gumballwithstate;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();
        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
