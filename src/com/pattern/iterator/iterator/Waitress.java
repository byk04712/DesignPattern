package com.pattern.iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    private ArrayList<Menu> menus;

    /**
     * 构造器中，女招待照顾两个菜单
     * @param pancakeHouseMenu
     * @param dinerMenu
     */
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> launchIterator = dinerMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = cafeMenu.createIterator();

        System.out.println("Menu\n---------------------------\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLaunch");
        printMenu(launchIterator);
        System.out.println("\nDinner");
        printMenu(dinnerIterator);

    }

    public void printMenu1() {
        // 两种打印方式都可
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
//        Iterator<Menu> iter = menus.iterator();
//        while (iter.hasNext()) {
//            printMenu(iter.next().createIterator());
//        }
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
