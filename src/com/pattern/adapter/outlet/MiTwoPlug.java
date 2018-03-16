package com.pattern.adapter.outlet;

public class MiTwoPlug implements TwoPlug {
    @Override
    public void powered() {
        System.out.println("小米两孔插座供电");
    }
}
