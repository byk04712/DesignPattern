package com.pattern.compound;

/**
 * CountingDuckFactory也扩展至抽象工厂
 * 每个方法都会先用声计数装饰者将Quackable包装起来。模拟器并不知道有何不同，只知道它实现了Quackable接口。
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
