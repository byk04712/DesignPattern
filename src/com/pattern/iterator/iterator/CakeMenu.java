package com.pattern.iterator.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CakeMenu implements Menu {

    private Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CakeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, letture, tomato, and fires", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrio, with people pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Hashtable<String, MenuItem> getItems() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
