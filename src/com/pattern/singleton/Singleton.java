package com.pattern.singleton;

/**
 * 单例类
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 为解决多线程时可能出现两个线程分别获取了对象问题，添加 synchronized 关键字，迫使每个线程在进入这个方法之前，要先等候别的线程离开该方法。
     * 也就是说不会有两个线程可以同时进入这个方法
     *
     * 这样同样存在一个隐藏问题，每次调用这个方法，同步都是一种累赘。
     * 解决方案：
     * 1.如果getInstance的性能对应用程序不是很关键，就什么都别做
     * 2.使用饿汉模式创建实例，而不用延迟实例化的做法
     * 3.用"双重检查加锁"，在 getInstance 中减少使用同步，参考 BestSigleton 类
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
