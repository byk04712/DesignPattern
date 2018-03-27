package com.pattern.proxy.gumballproxy;

public class GumballMonitor {
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine：" + machine.getLocation());
            System.out.println("Current inventory：" + machine.getCount() + " gumballs");
            System.out.println("Current state：" + machine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
