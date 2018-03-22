package com.pattern.iterator.iterator;

import java.util.Calendar;
import java.util.Iterator;

/**
 * 厨师决定午餐的菜单项能交替的改变
 * 周一，周三，周五和周六提供一些项
 * 周二，周四和周日提供另一项
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
