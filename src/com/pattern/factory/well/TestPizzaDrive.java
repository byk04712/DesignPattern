package com.pattern.factory.well;

import com.pattern.factory.well.store.ChicagoPizzaStore;
import com.pattern.factory.well.store.NYPizzaStore;
import com.pattern.factory.well.store.PizzaStore;

public class TestPizzaDrive {
    public static void main(String[] args) {
        // 1.首先我们需要一个纽约比萨店
        PizzaStore nyPizzaStore = new NYPizzaStore();


        // 2.现在已经有了一个比萨店了，可以接受订单
        nyPizzaStore.orderPizza("cheese");

        // 再来从芝加哥定一个比萨
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("veggie");
    }
}
