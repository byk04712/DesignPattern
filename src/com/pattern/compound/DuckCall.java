package com.pattern.compound;

/**
 * 鸭鸣器
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
