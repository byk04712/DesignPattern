package com.pattern.compound;

/**
 * 装饰者
 * 像适配器一样，我们需要实现目标接口
 */
public class QuackCounter implements Quackable {

    // 我们使用一个实例变量来记录被装饰的呱呱叫者
    private Quackable quackable;
    // 用一个静态变量记录跟踪所有呱呱叫次数
    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
