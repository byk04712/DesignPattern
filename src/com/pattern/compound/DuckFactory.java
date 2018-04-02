package com.pattern.compound;

/**
 * DuckFactory 扩展抽象工厂
 * 每个方法创建一个产品，一种特定类型的Quackable，模拟器并不知道实际的产品是什么，只知道它实现了Quackable接口
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
