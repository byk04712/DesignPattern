package com.pattern.status.gumballwithstate;

public interface State {
    /**
     * 放入25分钱
     */
    void insertQuarter();

    /**
     * 退钱
     */
    void ejectQuarter();

    /**
     * 扭转
     */
    void turnCrank();

    /**
     * 分配
     */
    void dispense();
}
