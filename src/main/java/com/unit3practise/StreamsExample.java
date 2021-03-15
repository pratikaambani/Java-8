package com.unit3practise;

import com.unit1practise.unit1exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class StreamsExample {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("pratik", "ambani", 26),
                new Person("Lewis", "Carroll", 25),
                new Person("Thomas", "Carlyle", 42),
                new Person("Charlotte", "Bronte", 61),
                new Person("peter", "Arnold", 78),
                new Person("Charles", "Dickens", 42)
        );

        people.stream()
                .filter(p -> p.getlName().startsWith("C"))
                .forEach(p -> System.out.println(p.getfName()));


        Stream<Person> ss = people.stream();

        people.stream()
                .filter(p -> p.getlName().startsWith("C"))
                .count();
        //Adding count terminates stream, cant change anymore(more operations)

        long count = people.stream()
                .filter(p -> p.getlName().startsWith("C"))
                .count();
        System.out.println("count: " + count);


        //Parallel Stream
        long countProcessInParallel = people.parallelStream()
                .filter(p -> p.getlName().startsWith("C"))
                .count();
        System.out.println("countProcessInParallel: " + countProcessInParallel);


    }
}
