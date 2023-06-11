package com.practise.temp;

import java.util.*;
import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {

        Person p1 = new Person("Pratik", 1);
        Person p2 = new Person("Sonu", 2);

        Map<Person, String> employees = new HashMap<>();
        employees.put(p1, "ambani");
        employees.put(p2, "patil");

        p2.setName("Sonali");
        employees.get(p2);



        puzzle1();
    }

    private static void puzzle1() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Mike", 25),
                new Person("Jack", 28),
                new Person("Ben", 20),
                new Person("Bose", 30)
        );

        Collection<List<String>> resultList =
                people.stream()
                        .map(Person::getName)
                        .collect(Collectors.groupingBy(x -> x.charAt(0)))
                        .values();
        System.out.println(resultList);
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}