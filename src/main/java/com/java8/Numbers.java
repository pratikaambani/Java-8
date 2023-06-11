package com.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        Predicate<Integer> excludeTwo = i -> i != 2;
        List<Integer> numbers = Arrays.asList(2, 2, 3, 5, 7, 11, 2, 13, 17, 19, 11, 23, 29);
        System.out.println(
                numbers.stream()
                        .filter(excludeTwo)
                        .count()
        );

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
//                .getMin();
//                .getMax();
//                .getCount();
//                .getAverage();
        System.out.println("stats: " + stats);

        int sum = numbers.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println("sum: " + sum);

        int min = numbers.stream()
                .mapToInt(x -> x)
                .min()
                .getAsInt();
        System.out.println("min: " + min);

        int max = numbers.stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);
        System.out.println("max: " + max);

        double average = numbers.stream()
                .mapToInt(x -> x)
                .average()
                .orElse(0);
        System.out.println("sum: " + average);

        System.out.println(
                "average: " + numbers.stream()
                        .distinct()
                        .collect(Collectors.toList())
        );
    }

}
