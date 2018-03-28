package com.pattern.proxy.gumballproxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        String[] locations = {"Beijing", "Shanghai", "Shenzhen"};
        int port = 8890;

        for (int i = 0; i < locations.length; i++) {
            Random random = new Random();
            int count = random.nextInt(100);
            try {
                GumballMachineRemote machine = new GumballMachine(locations[i], count, port + i);
                Registry registry = LocateRegistry.createRegistry(port + i);
                registry.rebind("gumballmachine_" + locations[i], machine);
                System.out.println("Remote Service Object bound successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
