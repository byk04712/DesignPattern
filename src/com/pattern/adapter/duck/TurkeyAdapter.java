package com.pattern.adapter.duck;

/**
 * 实现想要转换成的类型接口
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        // 取得需要适配的对象引用
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // quack 类之间的转换，只需要调用gobble即可
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 固然两个接口都具备了fly方法，火鸡的飞行距离很短，不像鸭子可以长途飞行。要让鸭子的飞行和火鸡的飞行能够对应，必须连续5次调用火鸡的fly来完成
        for (int i = 0; i < 5; i++)
            turkey.fly();
    }
}
