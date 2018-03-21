package com.pattern.iterator;

import java.awt.*;
import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    /**
     * 构造器中，女招待照顾两个菜单
     * @param pancakeHouseMenu
     * @param dinerMenu
     */
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinerMenu.createIterator();

        System.out.println("Menu\n---------------------------\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLaunch");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ",   ");
            System.out.print(menuItem.getPrice() + "  --  ");
            System.out.println(menuItem.getDescription());
        }
    }
}
