package com.pattern.compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式
 */
public class Flock implements Quackable{

    private ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }

    @Override
    public void quack() {
        // 迭代器模式
        Iterator<Quackable> iter = this.quackers.iterator();
        while (iter.hasNext()) {
            Quackable quacker = iter.next();
            quacker.quack();
        }
    }
}
