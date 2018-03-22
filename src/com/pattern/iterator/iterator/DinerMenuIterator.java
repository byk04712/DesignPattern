package com.pattern.iterator.iterator;

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

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < items.length - 1; i++) {
                items[i] = items[i+1];
            }
            items[items.length - 1] = null;
        }
    }
}
