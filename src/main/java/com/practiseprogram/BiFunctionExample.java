package com.practiseprogram;

import java.util.function.BiFunction;

/**
 * Created by Pratik Ambani on 5/11/2017.
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a * b;
        System.out.println("biFunction: " +biFunction.apply(65,34));
    }
}
