package com.unit3practise;

import com.unit1practise.unit1exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class MethodReferenceExample2 {

    public static void main(String args[]) {
         List<Person> people = Arrays.asList(
                    new Person("pratik", "ambani", 26),
                    new Person("Lewis", "Carroll", 25),
                    new Person("Thomas", "Carlyle", 42),
                    new Person("Charlotte", "Bronte", 61),
                    new Person("peter", "Arnold", 78),
                    new Person("Charles", "Dickens", 42)
            );
//            performConditionally(people, p -> true, p -> System.out.println(p));
            performConditionally(people, p -> true, System.out::println);
         }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
