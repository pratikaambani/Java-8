package com.practise.individualprograms;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Ram", "Ravi", "Shreya", "Sam", "Shreya");
        Map<String, Long> dataAsMap = countByForEachLoopWithMapCompute(names);
        System.out.println(dataAsMap);


        List<Person> people = Arrays.asList(
                new Person("pratik", 2),
                new Person("Pratik", 334),
                new Person("Ram",42),
                new Person("ram", 34) ,
                new Person("Shyam", 73),
                new Person("shyam", 83),
                new Person("Karan", 83),
                new Person("karan", 865)
        );

        System.out.println("people before sorting: " + people);

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("people after sorting: " + people);


    }

    public static <T> Map<T, Long> countByForEachLoopWithMapCompute(List<T> inputList) {
        Map<T, Long> resultMap = new HashMap<>();
        inputList.forEach(e -> resultMap.compute(e, (k, v) -> v == null ? 1L : v + 1L));
        return resultMap;
    }

}

class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}