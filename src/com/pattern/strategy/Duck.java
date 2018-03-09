package com.pattern.strategy;

/**
 * 鸭子
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys! ");
    }

    protected void performFly() {
        if (this.flyBehavior != null) {
            this.flyBehavior.fly();
        }
    }

    protected void performQueak() {
        if (this.quackBehavior != null) {
            this.quackBehavior.quack();
        }
    }

    protected void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    protected void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

}
