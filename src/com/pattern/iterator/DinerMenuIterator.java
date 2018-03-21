package com.pattern.iterator;

import java.util.Iterator;

/**
 * 实现了迭代器，知道如何遍历数组菜单项
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
