package com.pattern.decorate.starbuck;

/**
 * 饮料 抽象的 component 类
 */
public abstract class Beverage {

    // 小杯，中杯，大杯 （额外扩展）
//    private Enum size;

    /**
     * 饮料的描述
     */
    protected String description = "Unkown beverage";

    /**
     * 饮料价格
     */
    protected double price;

    public abstract double cost();

    public String getDescription() {
        return description + "(" + price + ")";
    }

    public double getPrice() {
        return price;
    }

//    public Enum getSize() {
//        return size;
//    }
//
//    public void setSize(Enum size) {
//        this.size = size;
//    }
}

// 杯型
//enum Size {
//    TALL("小杯"), GRANDE("中杯"), VENTI("大杯");
//
//    private final String label;
//
//    Size(String label) {
//        this.label = label;
//    }
//
//    @Override
//    public String toString() {
//        return label;
//    }
//}