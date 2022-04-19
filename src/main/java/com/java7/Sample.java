package com.java7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        try {
            try {
                System.out.println(4);
            } catch (Exception e) {
                System.out.println(5);
            } finally {
                System.out.println(6);
            }
        } catch (Exception e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }

    }
}

 class Sample1 {
    public int value;
}
