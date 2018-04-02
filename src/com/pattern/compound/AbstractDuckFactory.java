package com.pattern.compound;

/**
 * 我们定义一个抽象工厂，它的子类们会创建不同的家族
 */
public abstract class AbstractDuckFactory {
    // 每个方法创建一种鸭子
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
