package com.pattern.iterator.composite;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 展示所有菜单
      */
    public void printMenu() {
        this.allMenus.print();
    }

    /**
     * 展示素食菜单
     */
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n--------------------------------");
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
//            if (component instanceof MenuItem && component.isVegetarian()) {
//                component.print();
//            }
            // 或者 在 Menu 中重写 isVegetarian 方法，方法永远返回 false
            try {
                if (component.isVegetarian()) {
                        component.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
