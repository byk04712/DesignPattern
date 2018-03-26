package com.pattern.status.gumballwithstate;

import java.util.Random;

public class HasQuarterState implements State {

    // 增加一个随机数产生器，产生10%赢的机会
    private Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        // 通过构造器将糖果对象记录在实例变量中
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        // 如果赢了，而且有足够的糖果可以让他一次得到两颗，我们就进入 WinnerState 状态，否则和平常一样进入 SoldState 状态
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
