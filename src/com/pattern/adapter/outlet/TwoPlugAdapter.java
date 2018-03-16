package com.pattern.adapter.outlet;

public class TwoPlugAdapter implements ThreePlug {

    private TwoPlug twoPlug;

    public TwoPlugAdapter(TwoPlug twoPlug) {
        System.out.println("两孔转三孔的适配器");
        this.twoPlug = twoPlug;
    }

    @Override
    public void powered() {
        this.twoPlug.powered();
    }
}
