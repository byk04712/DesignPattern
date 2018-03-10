package com.pattern.decorate.starbuckWithSize;

/**
 * 饮料
 */
public abstract class Beverage {

    public enum Size { Tall("小杯"), Grande("中杯"), Venti("大杯");

        private final String label;

        Size(String s) {
            label = s;
        }

        @Override
        public String toString() {
            return label;
        }
    };

    // 描述
    protected String description;

    // 价格
    protected double price;

    // 尺寸
    protected Size size = Size.Grande;

    /**
     * 饮料价格
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
