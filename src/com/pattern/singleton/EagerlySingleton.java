package com.pattern.singleton;

/**
 * 饿汉单例模式
 */
public class EagerlySingleton {

    private static EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton() {}

    public static EagerlySingleton getInstance() {
        return instance;
    }

}
