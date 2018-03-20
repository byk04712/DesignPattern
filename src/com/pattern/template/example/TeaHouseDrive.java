package com.pattern.template.example;

public class TeaHouseDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n\n\n");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
