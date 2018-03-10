package com.pattern.decorate.starbuckWithSize;

public class StarbuckCoffee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + "  价格：" + darkRoast.cost());

        Beverage decaf = new Decaf();
        decaf.setSize(Beverage.Size.Tall); // 小杯
        decaf = new Soy(decaf);
        decaf = new Milk(decaf);
        System.out.println(decaf.getDescription() + "  价格：" + decaf.cost());

        Beverage houseblend = new HouseBlend();
        houseblend.setSize(Beverage.Size.Venti); // 大杯
        houseblend = new Soy(houseblend);
        houseblend = new Milk(houseblend);
        houseblend = new Whip(houseblend);
        System.out.println(houseblend.getDescription() + "  价格：" + houseblend.cost());

    }
}
