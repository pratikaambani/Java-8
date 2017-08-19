package com.unit3practise;

import com.unit1practise.unit1exercise.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class CollectionIterationExample {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("pratik", "ambani", 26),
                new Person("Lewis", "Carroll", 25),
                new Person("Thomas", "Carlyle", 42),
                new Person("Charlotte", "Bronte", 61),
                new Person("peter", "Arnold", 78),
                new Person("Charles", "Dickens", 42)
        );

        //external iterator
        System.out.println("\n \n \n Using for loop");
        for(int i=0; i<people.size(); i++) {
            System.out.println(people.get(i));
        }

        //external iterator
        System.out.println("Using for in loop");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("\n \n \n");


        //internal iterator
        //order not maintained, how iteration(sequence) happens we don't have control

        people.forEach(p -> System.out.println(p));
        //or better
        people.forEach(System.out::println);

    }

}
