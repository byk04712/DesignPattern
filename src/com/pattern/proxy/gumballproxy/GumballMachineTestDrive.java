package com.pattern.proxy.gumballproxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.ParseException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        String location = getInputLocation();
        int gumballs = getInputGumballs();
        int port = 8890;
        try {
            GumballMachineRemote machine = new GumballMachine(location, gumballs, port);
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("gumballMachine", machine);
            System.out.println("Remote Service Object bound successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getInputGumballs() {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please set your inventory：");
            String typeStr = br.readLine();
            count = Integer.parseInt(typeStr);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect，Only Number ");
            return getInputGumballs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    private static String getInputLocation() {
        String answer = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please typing your location：");
            answer = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }
}
