package com.practiseprogram;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CustomFunctions {
    public static void main(String[] args) {
        ex1();
        ex2();

        biFunction();

    }

    private static void biFunction() {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("biFunction: " +biFunction.apply(65,34));
    }

    private static void ex2() {
        Function<String, Integer> fun = s -> s.length();
        Function<Integer, Integer> anotherFun = i -> i * 2;
        Integer value = fun.andThen(anotherFun).apply("Pratik Ambani");
        System.out.println(value);
    }

    private static void ex1() {
        Function<String, Integer> fun = s -> s.length();
//        Alternatively,
//        Function<String, Integer> fun = String::length;
        Integer value = fun.apply("Pratik");
        System.out.println(value);
    }

}
