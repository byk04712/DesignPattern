package com.pattern.adapter.duck;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        // 因为鸭子比火鸡更会飞，所以我们决定让鸭子平均5次只飞一次
        if (random.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}
