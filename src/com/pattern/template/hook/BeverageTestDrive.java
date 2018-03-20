package com.pattern.template.hook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffee = new CoffeeWithHook();
        System.out.println("Making Coffee... ");
        coffee.prepareRecipe();

        CaffeineBeverageWithHook tea = new TeaWithHook();
        System.out.println("\n\n\nMaking Tea...");
        tea.prepareRecipe();
    }
}
