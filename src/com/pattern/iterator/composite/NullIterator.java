package com.pattern.iterator.composite;

import java.util.Iterator;

/**
 * 空迭代器
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
