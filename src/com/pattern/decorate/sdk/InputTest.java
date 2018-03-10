package com.pattern.decorate.sdk;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream is = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("decorate-test.txt")
                    )
            );

            while ((c = is.read()) >= 0) {
                System.out.print((char)c);
            }

            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
