package com.pattern.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like Lemon with your tea (y/n) ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }

        if (br == null)
            return "no";

        return answer;
    }
}
