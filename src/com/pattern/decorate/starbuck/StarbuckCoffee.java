package com.pattern.decorate.starbuck;

public class StarbuckCoffee {
    public static void main(String[] args) {
        // 订一杯浓缩咖啡，什么调味都不加
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " 一共 $" + espresso.cost());

        // 订一杯首选咖啡
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);   // 加豆浆
        System.out.println(houseBlend.getDescription() + " 一共 $" + houseBlend.cost());

        // 订一杯烘焙咖啡
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast); // 加摩卡
        darkRoast = new Whip(darkRoast); // 加奶泡
        darkRoast = new Whip(darkRoast); // 加奶泡
        darkRoast = new Milk(darkRoast); // 加牛奶
        System.out.println(darkRoast.getDescription() + " 一共 $" + darkRoast.cost());
    }
}
