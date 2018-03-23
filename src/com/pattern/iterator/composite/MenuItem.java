package com.pattern.iterator.composite;

import java.util.Iterator;

/**
 * 菜单项
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.print("    " + this.getName());
        if (isVegetarian())
            System.out.print("(v)");
        System.out.println(",  " + this.getPrice());
        System.out.println("    --" + this.getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
