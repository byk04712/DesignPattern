package com.pattern.combination;

import java.util.ArrayList;

public class PancakeHouseMenu {
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

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }
}
