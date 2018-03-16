package com.pattern.adapter.jdk;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator<E> implements Iterator<E> {

    private ArrayList<E> arrayList;

    public ArrayListIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return arrayList.listIterator().hasNext();
    }

    @Override
    public E next() {
        return arrayList.listIterator().next();
    }
}
