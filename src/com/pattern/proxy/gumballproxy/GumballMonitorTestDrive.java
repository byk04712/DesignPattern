package com.pattern.proxy.gumballproxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {
                "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightlygumball.com/gumballmachine",
                "rmi://seattle.mightlygumball.com/gumballmachine"
        };

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
