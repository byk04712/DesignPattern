package com.pattern.adapter.duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        // 创建一只鸭子
        Duck mallardDuck = new MallardDuck();

        // 创建一只火鸡
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck mallardDuck) {
        mallardDuck.quack();
        mallardDuck.fly();
    }
}
