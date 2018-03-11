package com.pattern.factory.pizzaEnhance;

/**
 * 披萨店
 */
public abstract class PizzaStore {

    // 下单披萨
    public Pizza orderPizza(String type) {
        
        Pizza pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    // 制作披萨由不同地区的分店去进行制作适合当地口味的披萨
    // 实例化披萨的责任被移到一个方法中，此方法就如同是一个工厂
    protected abstract Pizza createPizza(String type);

}
