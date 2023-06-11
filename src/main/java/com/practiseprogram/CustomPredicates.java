package com.practiseprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomPredicates {
    public static void main(String[] args) {

        //type1
        firstExample();

        //type2
        secondExample();

        //int predicate
        intPredicate();

        //bipredicate
        bipredicate();
    }

    private static void bipredicate() {
        BiPredicate<Integer, String> condition = (i, s) -> i < 20 || s.startsWith("C");
        System.out.println(condition.test(10, "Kennedy"));
        System.out.println(condition.test(20, "Bush"));
        System.out.println(condition.test(30, "Obama"));
        System.out.println(condition.test(40, "Chomu"));
    }

    private static void intPredicate() {
        int b = 0;
        IntPredicate predicate = (a) -> (a == b);
        System.out.println("predicate: " + predicate.test(0));
        System.out.println("predicate: " + predicate.test(1));
        System.out.println("predicate: " + predicate.test(2));
    }

    private static void firstExample() {

        // Creating predicate
        Predicate<Integer> lessThan = i -> (i < 18);
        // Calling Predicate method
        System.out.println(lessThan.test(10));

        Predicate<Integer> greaterThan10 = i -> i > 10;
        System.out.println(greaterThan10.test(20));
    }

    private static void secondExample() {
        List<Employee> allEmployees = buildEmployees();
        System.out.println(SomePredicates.filterEmployees(allEmployees, SomePredicates.isAdultMale()));
        System.out.println(SomePredicates.filterEmployees(allEmployees, SomePredicates.isAdultFemale()));
        System.out.println(SomePredicates.filterEmployees(allEmployees, SomePredicates.isAgeMoreThan(35)));
    }

    private static List<Employee> buildEmployees() {
        Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
        Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
        Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
        Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
        Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
        Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
        Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
        Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
        Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
        Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
}

class SomePredicates {

    //custom predicate
    static Predicate<Employee> isAdultMale() {
        return m -> m.getAge() >= 18 && m.getGender().equalsIgnoreCase("Male");
    }

    //custom predicate
    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    //custom predicate
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    //custom predicate with stream
    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}


class Employee {

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public Employee(Integer id, Integer age, String gender, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) &&
                age.equals(employee.age) &&
                gender.equals(employee.gender) &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, gender, firstName, lastName);
    }
}