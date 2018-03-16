package com.pattern.adapter.jdk;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将枚举适配到迭代器
 * @param <E>
 */
public class EnumerationIterator<E> implements Iterator {

    private Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

}
