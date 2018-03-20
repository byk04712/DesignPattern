package com.pattern.template.hook;

/**
 * 模版方法带上勾子
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 我们加上了一个小小的条件语句，而该条件是否成立，是由一个具体的方法 customerWantsCondiments 决定的。
        // 如果顾客想要调料，只有这时我们才调用 addCondiments
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void addCondiments();

    /**
     * 我们在这里定义了一个方法（通常）是空的缺省实现。这个方法只会返回true，不做别的事
     * @return
     */
    public boolean customerWantsCondiments() {
        // 这就是一个勾子，子类可以覆盖这个方法
        return true;
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

}
