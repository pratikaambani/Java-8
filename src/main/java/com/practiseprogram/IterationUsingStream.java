package com.practiseprogram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Pratik Ambani on 21/10/2017.
 */
public class IterationUsingStream {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(4, 6, 3, 68, 4, 37, 42, 85);
        System.out.println("summation without Stream: " +sumIterator(myList));
        System.out.println("summation with Stream: " +sumOfIterator(myList));
    }

    //Iteration without Java8
    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> i = list.iterator();

        int sum = 0;
        while (i.hasNext()) {
            int num = i.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    //Iteration using Java8
    private static int sumOfIterator(List<Integer> list) {
        return list.stream().filter(i -> i>10).mapToInt(i -> i).sum();
    }
}
