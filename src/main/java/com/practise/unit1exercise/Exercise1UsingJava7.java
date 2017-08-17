package com.practise.unit1exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Condition {
    boolean test(Person p);
}

/**
 * Created by AmbaniP on 16/08/2017.
 */
public class Exercise1UsingJava7 {
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
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getlName().compareTo(o2.getlName());
            }
        });

        // 2. Create method that prints all elements in the list
        printAll(people);

        // 3. Create method that prints all people that have last name beginning with C
        System.out.println("\n \n \n");
        System.out.println("People having lastname starting with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getlName().startsWith("C");
            }
        });

        System.out.println("\n \n \n");
        System.out.println("People having firstname starting with P");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getfName().startsWith("p");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("\n \n \n");
    }
}
