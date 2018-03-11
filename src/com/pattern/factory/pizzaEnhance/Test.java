package com.pattern.factory.pizzaEnhance;

public class Test {
    public static void main(String[] args) {
        // Joel 订单
        PizzaStore nyPizzaStore = new NewYorkPizzaStore();
        nyPizzaStore.orderPizza("clam");

        // Ethan 订单
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("veggie");
    }
}
