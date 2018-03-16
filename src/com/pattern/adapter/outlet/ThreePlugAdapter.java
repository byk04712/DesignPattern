package com.pattern.adapter.outlet;

public class ThreePlugAdapter implements TwoPlug {

    private ThreePlug threePlug;

    public ThreePlugAdapter(ThreePlug threePlug) {
        System.out.println("三孔转两孔的适配器");
        this.threePlug = threePlug;
    }

    @Override
    public void powered() {
        threePlug.powered();
    }
}
