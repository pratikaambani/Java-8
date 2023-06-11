package com.practiseprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args) {

        mapExample();


        mapVsFlatmap();
    }

    private static void mapVsFlatmap() {
        List<String> salutations = new ArrayList<>(Arrays.asList("Hello", "Hi", "Yo", "SSUP", "Hey", "Hee"));
        List<String> countries = new ArrayList<>(Arrays.asList("India", "United Kingdom", "United Stated", "China", "Japan", "Australia"));

        map(salutations, countries);

        flatmap(salutations, countries);
    }

    private static void mapExample() {
        List<String> vowels = Arrays.asList("A", "E", "I", "O", "U");
        vowels.stream()
                .map(vowel -> vowel.toLowerCase())
                .forEach(value -> System.out.println(value));
    }

    private static void flatmap(List<String> salutations, List<String> welcomeList) {
        List<List<String>> nestedList = Arrays.asList(salutations, welcomeList);
        nestedList.stream().
                flatMap(list -> list.stream())
                .map(value -> value.toUpperCase())
                .forEach(value -> System.out.println(value));
    }

    private static void map(List<String> salutations, List<String> countries) {

        List<List<String>> nestedList = Arrays.asList(salutations, countries);
        nestedList.stream()
                .map(list -> {
                    return list.stream()
                            .map(value -> value.toUpperCase());
                })
                .forEach(value -> System.out.println(value));
    }

}
