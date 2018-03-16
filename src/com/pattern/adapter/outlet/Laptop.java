package com.pattern.adapter.outlet;

public class Laptop {

    /**
     * 笔记本使用两孔插座充电
     * @param twoPlug
     */
    public void chargeOnTwoPlug(TwoPlug twoPlug) {
        twoPlug.powered();
    }

    /**
     * 笔记本使用三孔插座充电
     * @param threePlug
     */
    public void chargeOnThreePlug(ThreePlug threePlug) {
        threePlug.powered();
    }

    public static void main(String[] args) {
        // 笔记本电脑
        Laptop mac = new Laptop();

        // 两孔插座
        TwoPlug twoPlug = new MiTwoPlug();
        // 三孔插座
        ThreePlug threePlug = new MiThreePlug();

        // 三孔转两孔的插座适配器
        ThreePlug twoPlugAdapter = new TwoPlugAdapter(twoPlug);
        // 两孔转三孔的插座适配器
        TwoPlug threePlugAdapter = new ThreePlugAdapter(threePlug);

        // 使用三孔的插座充电
        mac.chargeOnThreePlug(twoPlugAdapter);
        // 使用两孔的插座充电
        mac.chargeOnTwoPlug(threePlugAdapter);
    }
}
