package com.practiseprogram;

import java.util.function.IntPredicate;

/**
 * Created by Pratik Ambani on 5/11/2017.
 */
public class IntPredicateExample {
    public static void main(String[] args) {
        int b = 0;
        IntPredicate predicate = (a) -> (a == b);
        System.out.println("predicate: " +predicate.test(0));
    }
}
