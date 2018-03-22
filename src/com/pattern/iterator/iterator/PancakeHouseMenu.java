package com.pattern.iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();

        this.menuItems.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        this.menuItems.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        this.menuItems.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        this.menuItems.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

//    public ArrayList<MenuItem> getMenuItems() {
//        return this.menuItems;
//    }

    // 用迭代器改写餐厅菜单
    // 返回迭代器接口。客户不需要知道餐厅菜单是如何维护菜单的，也不需要知道迭代器是如何实现的。客户只需直接使用这个迭代器遍历菜单项即可
//    public Iterator<MenuItem> createIterator() {
//        return new DinerMenuIterator(this.menuItems.toArray(new MenuItem[this.menuItems.size()]));
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
