package com.pattern.template.compare;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 7),
                new Duck("Dewey", 2),
                new Duck("Howard", 3),
                new Duck("Louie", 6),
                new Duck("Donald", 1),
                new Duck("Huey", 10)
            };
        System.out.println("Sort before .... ");
        showDuck(ducks);

        Arrays.sort(ducks);

        System.out.println("\n\nSort after .... ");
        showDuck(ducks);
    }

    private static void showDuck(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++)
            System.out.println(ducks[i]);
    }
}
