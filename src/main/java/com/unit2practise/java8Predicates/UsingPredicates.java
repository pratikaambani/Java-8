package com.unit2practise.java8Predicates;

import com.unit1practise.unit1exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by AmbaniP on 16/08/2017.
 */
public class UsingPredicates {
    public static void main(String args[]) {

        List<Person> people = Arrays.asList(
                new Person("pratik", "ambani", 26),
                new Person("Lewis", "Carroll", 25),
                new Person("Thomas", "Carlyle", 42),
                new Person("Charlotte", "Bronte", 61),
                new Person("peter", "Arnold", 78),
                new Person("Charles", "Dickens", 42)
        );

        // 1. Sort list by name
        Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p1.getlName()));

        // 2. Create method that prints all elements in the list
        performConditionally(people, p -> true);

        // 3. Create method that prints all people that have last name beginning with C
        System.out.println("\n \n \n");
        System.out.println("People having lastname starting with C");
        performConditionally(people, p -> p.getlName().startsWith("C"));

        System.out.println("\n \n \n");
        System.out.println("People having firstname starting with P");
        performConditionally(people, p -> p.getfName().startsWith("p"));
    }

    //Using Predicate | Functional Interface |
    //perform, not print
    private static void performConditionally(List<Person> people, Predicate<Person> predicate) {
        people.stream().filter(predicate::test).forEachOrdered(System.out::println);
    }
}
