package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String name;

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
*/

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StreamPractise {
    public static void main(String[] args) {

        List<Integer> ll = Arrays.asList(1, 2, 3, 6, 106, 800, 100, 2, 2, 2, 2);
        double dd = ll.stream()
                .map(x -> x * x) //square
                .filter(number -> number > 100) //>100
                .mapToInt(x -> x) //toInt
                .average().getAsDouble();
        System.out.println(dd);


        Employee e1 = new Employee(1, "P");
        Employee e2 = new Employee(1, "P");
        Employee e3 = new Employee(2, "Q");

        Map<Employee, String> mm = new HashMap();
        mm.put(e1, "Pratik");
        mm.put(e2, "Ambani");
        mm.put(e3, "Pratik");

/*
        System.out.println("#############################");
        System.out.println("Comma-separated string to List.");
        getCommaSeparated();

        System.out.println("#############################");
        System.out.println("Find from List");
        findFromList();

        System.out.println("#############################");
        System.out.println("Find First");
        findFirst();

        System.out.println("#############################");
        System.out.println("Any Match ==> returns boolean");
        anyMatch();

        System.out.println("#############################");
        System.out.println("All Match ==> returns boolean");
        allMatch();

        System.out.println("#############################");
        System.out.println("Sum from a list of objects");
        List<Person> people = getSummation();

        System.out.println("#############################");
        System.out.println("Remove or get duplicates");
        duplicates();

        System.out.println("#############################");
        System.out.println("Min and Max");
        minMax();

        System.out.println("#############################");
        System.out.println("Sort list of objects by property");
        sortByProperty(people);

        System.out.println("#############################");
        System.out.println("Grouping of objects");
        groupBy();

        System.out.println("#############################");
        System.out.println("Skip member at xth position");
        skip();

        System.out.println("#############################");
        System.out.println("Peek: This method helps to see/debug the intermediate results while performing the intermediate operations");
        peek();

        System.out.println("#############################");
        System.out.println("IntelliJ Stream debugger");
        intellijDebugger();
*/

    }

    private static void intellijDebugger() {
        List<String> values = Stream.of("Welcome",  "to",  "Ahmedabad",  "the",  "city",  "of",  "Ahmedabad",  "is",  "very",  "warm",  "during",  "season",  "of",  "summer")
                .filter(c -> c.length()>2)
                .map(x -> x.substring(2))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(values);
    }

    private static void peek() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Pratik", 100, 31));
        people.add(new Person("Sonu", 10000000, 28));
        people.add(new Person("Mishtu", 10000000, 1));

        List<String> ppl = people.stream()
                .filter(person -> person.getSalary() == 10000000)
                .peek(person -> System.out.println(person))
                .map(person -> person.getName().toUpperCase())
                .peek(System.out::println)
                .collect(Collectors.toList());
        ppl.forEach(System.out::println);
    }

    private static void skip() {
        List<Integer> duplicateNumbers = Arrays.asList(1, 1, 1, 2, 3, 2, 5, 7, 9, 6, 5, 3, 2, 5, 7, 8);
        duplicateNumbers.stream()
                .skip(1).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void groupBy() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Pratik", 100, 31));
        people.add(new Person("Sonu", 10000000, 28));
        people.add(new Person("Mishtu", 10000000, 1));

        //group by salary
        Map<Integer, List<Person>> ll = people.stream()
                .collect(Collectors.groupingBy(Person::getSalary));
        System.out.println(ll);
    }

    private static void sortByProperty(List<Person> people) {
        List<Person> sortedOrder = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println(sortedOrder);

        List<Person> reverserSortedOrder = people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(reverserSortedOrder);
    }

    private static void duplicates() {
        List<Integer> duplicateNumbers = Arrays.asList(1, 1, 1, 2, 3, 2, 5, 7, 9, 6, 5, 3, 2, 5, 7, 8);

        List<Integer> distinctValues = duplicateNumbers.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(distinctValues);

        List<Integer> duplicates = duplicateNumbers.stream()
                .filter(value -> Collections.frequency(duplicateNumbers, value) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }

    private static void minMax() {
        List<Integer> duplicateNumbers = Arrays.asList(1, 1, 1, 2, 3, 2, 5, 7, 9, 6, 5, 3, 2, 5, 7, 8);

        Integer minValue = duplicateNumbers.stream()
                .min(Comparator.comparing(x -> x)).get();
        System.out.println(minValue);

        Integer maxValue = duplicateNumbers.stream()
                .max(Comparator.comparing(x -> x)).get();
        System.out.println(maxValue);
    }

    private static List<Person> getSummation() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Pratik", 100, 31));
        people.add(new Person("Sonu", 200, 28));
        people.add(new Person("Mishtu", 10000000, 1));

        //average
        double avgSalary = people.stream()
                .mapToDouble(Person::getSalary).average().getAsDouble();
        System.out.println(avgSalary);

        //type1
        double summation = people.stream()
                .mapToDouble(Person::getSalary).sum();
        System.out.println("summation: " + summation);

        //type2
        int sum = people.stream()
                .map(Person::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(sum);
        return people;
    }

    private static void findFromList() {
        List<String> names = Arrays.asList("Pratik", "Mishti", "Sonu Dilli");
        String name = names.stream()
                .filter(value -> value.equalsIgnoreCase("Pratik"))
                .findAny()
                .orElseGet(null);
        System.out.println(name);
    }

    private static void findFirst() {
        List<String> names = Arrays.asList("Pratik", "Paresh", "Pintu", "Parth", "Mishti", "Sonu Dilli");
        String name = names.stream()
                .sorted()
                .filter(value -> value.startsWith("P"))
                .findFirst().get();
        System.out.println(name);
    }

    private static void anyMatch() {
        List<String> names = Arrays.asList("Pratik", "Paresh", "Pintu", "Parth", "Mishti", "Sonu Dilli");
        boolean startsWithP = names.stream()
                .anyMatch(x -> x.startsWith("P"));
        System.out.println(startsWithP);
    }

    private static void allMatch() {
        List<String> names = Arrays.asList("Pratik", "Paresh", "Pintu", "Parth", "Mishti", "Sonu Dilli");
        boolean startsWithP = names.stream()
                .allMatch(x -> x.startsWith("P"));
        System.out.println(startsWithP);
    }

    private static void getCommaSeparated() {
        String numbers = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
        System.out.println(numbers);
        List<Integer> integers = Stream.of(numbers.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(integers);
    }
}

class Person {
    private String name;
    private int salary;
    private int age;

    public Person(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}