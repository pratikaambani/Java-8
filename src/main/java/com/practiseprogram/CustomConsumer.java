package com.practiseprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Pratik Ambani on 5/11/2017.
 */
public class CustomConsumer {
    public static void main(String[] args) {

        consumer();

        biConsumer();
    }

    private static void consumer() {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
        // Implement display using accept()
        display.accept(10);
    }

    private static void biConsumer() {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "A");
        employees.put(2, "B");
        employees.put(3, "C");
        employees.put(4, "D");
        employees.put(5, "E");
        employees.put(6, "F");

        BiConsumer biConsumer = (id, name) -> System.out.println("ID: " +id+ " and Name: " +name);
        employees.forEach(biConsumer);
    }
}
