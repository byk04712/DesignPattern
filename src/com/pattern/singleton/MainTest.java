package com.pattern.singleton;

public class MainTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        EagerlySingleton eagerlySingleton1 = EagerlySingleton.getInstance();
        EagerlySingleton eagerlySingleton2 = EagerlySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.equals(lazySingleton2));

        System.out.println(eagerlySingleton1 == eagerlySingleton2);
        System.out.println(eagerlySingleton1.equals(eagerlySingleton2));
    }
}
