package com.pattern.singleton;

/**
 * 完美的单例实现，不会出现多线程同时运行时可能出现实例化多个，也避免每次调用 getInstance 都进行同步
 */
public class BestSigleton {

    private volatile static BestSigleton instance;

    private BestSigleton() {}

    public static BestSigleton getInstance() {
        // 先检查实例，如果不存在，就进入同步区块 （只有第一次才会进入 if 代码块）
        if (instance == null) {
            synchronized(BestSigleton.class) {
                // 再次检查，确保没有实例化过
                if (instance == null)
                    instance = new BestSigleton();
            }
        }
        return instance;
    }

}
