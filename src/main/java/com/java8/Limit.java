package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
        List<Integer> numbers = evenNumbers.limit(200).collect(Collectors.toList());
        System.out.println("numbers: " + numbers);

        float a = 44 / 0;
        System.out.println(a);
    }
}
