package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 2, 3, 5, 7, 11, 13, 17, 19, 11, 23, 29);
        System.out.println(numbers.stream().filter(i->i!=2).collect(Collectors.toList()).size());

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
                //.getAverage();
        System.out.println("stats: " +stats);

        int sum = numbers.stream().mapToInt(x -> x).sum();
        System.out.println("sum: " + sum);

        int min = numbers.stream().mapToInt(x -> x).min().getAsInt();
        System.out.println("min: " + min);

        int max = numbers.stream().mapToInt(x -> x).max().orElse(0);
        System.out.println("max: " + max);

        double average = numbers.stream().mapToInt(x -> x).average().orElse(0);
        System.out.println("sum: " + average);

        System.out.println("average: " +numbers.stream().distinct().collect(Collectors.toList()));
    }

}
