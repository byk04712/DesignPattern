package com.pattern.strategy;

/**
 * 鸣鸭器
 * 猎人用鸭鸣器模拟出鸭叫声，以引诱野鸡。
 * 如何实现自己的鸭鸣器
 */
public class Duckcall {

    protected QuackBehavior quackBehavior;

    public Duckcall(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQueak() {
        if (this.quackBehavior != null) {
            this.quackBehavior.quack();
        }
    }
}
