package com.practiseprogram;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

/**
 * Created by Pratik Ambani on 5/11/2017.
 */
public class PredicateExample {
    public static void main(String[] args) {

        //int predicate
        int b = 0;
        IntPredicate predicate = (a) -> (a == b);
        System.out.println("predicate: " +predicate.test(0));

        //bipredicate
        BiPredicate<Integer, String> condition = (i, s)-> i<20 || s.startsWith("C");
        System.out.println(condition.test(10,"Kennedy"));
        System.out.println(condition.test(20,"Bush"));
        System.out.println(condition.test(30,"Obama"));
        System.out.println(condition.test(40,"Chomu"));
    }
}
