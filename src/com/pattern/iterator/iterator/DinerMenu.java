package com.pattern.iterator.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on while wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Hotdog22", "A hot dog, with sauerkraut, relish, onions, topped with cheese 2", true, 3.15);
        addItem("Hotdog33", "A hot dog, with sauerkraut, relish, onions, topped with cheese 3", false, 3.25);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    // 用迭代器改写餐厅菜单
    // 返回迭代器接口。客户不需要知道餐厅菜单是如何维护菜单的，也不需要知道迭代器是如何实现的。客户只需直接使用这个迭代器遍历菜单项即可
    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
