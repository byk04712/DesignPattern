package com.pattern.adapter.outlet;

public class MiThreePlug implements ThreePlug {
    @Override
    public void powered() {
        System.out.println("小米三孔插座供电");
    }
}
