package com.unit2practise.java8Predicates;

import java.util.function.BiConsumer;

/**
 * Created by AmbaniP on 17/08/2017.
 */
public class ExceptionHandling {
    public static void main(String args[]) {
        int[] someNumbers = {1, 2, 3, 4};
        int key1 = 2;
        int key2 = 0;

        //summation
        process(someNumbers, key1, (v, k) -> System.out.println(v+k));
        System.out.println("\n \n \n");

        //division
        process(someNumbers, key1, (v, k) -> System.out.println(v/k));
        System.out.println("\n \n \n");

        //doesn't look elegant
        process(someNumbers, key2, (v, k) -> {
            try {
                System.out.println(v/k);
            } catch (ArithmeticException e) {
                System.out.println("Exception occurred: " +e);
            }
                });
        System.out.println("\n \n \n");



        process(someNumbers, key1, wrapperLambda((v, k) -> System.out.println(v/k)));

        System.out.println("\n \n \n");

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    //wrapper lambda
    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
//        return (v,k) -> System.out.println(v + k);
//        return (v,k) -> consumer.accept(v,k);
        return (v,k) -> {
            try {
                consumer.accept(v,k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught from wrapper lambda, Error message" +e);
            }
        };
    }
}
