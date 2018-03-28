package com.pattern.proxy.gumballproxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {"Beijing", "Shanghai", "Shenzhen"};
        int port = 8890;

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1:" + (port + i) + "/gumballmachine_" + locations[i]);
                monitors[i] = new GumballMonitor(machine);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++) {
            monitors[i].report();
        }
    }
}
