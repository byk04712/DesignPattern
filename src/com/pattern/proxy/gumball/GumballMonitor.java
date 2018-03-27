package com.pattern.proxy.gumball;

/**
 * 糖果监视器
 * 取得机器的位置，糖果的库存量以及当前机器的状态
 */
public class GumballMonitor {

    private GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine：" + machine.getLocation());
        System.out.println("Current inventory：" + machine.getCount() + " gumballs");
        System.out.println("Current state：" + machine.getState());
    }

}
