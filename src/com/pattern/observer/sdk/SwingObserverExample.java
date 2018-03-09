package com.pattern.observer.sdk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    private static JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame("Swing中使用观察者案例之一");
        frame.setBounds(400,200,300,200);

        JButton button = new JButton("Button中的响应使用了观察者模式");
        button.addActionListener(new ActionListener1());
        button.addActionListener(new ActionListener2());

        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ActionListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("观察者1");
        }
    }

    private class ActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("观察者2");
        }
    }
}
