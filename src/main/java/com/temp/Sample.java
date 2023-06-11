package com.temp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Person(name, age)
        List<Person()> ; create sub-lists of names for each first alphabet char in the name
        Input : [{John, 20}, {Mike, 25}, {Jack, 28}, {Ben, 20}, {Bose, 30}]
        Output : [[Jack, John], [Ben, Bose], [Mike]]
*/
public class Sample {

    public static List<Integer> maxSubArray(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int sum = max;
        int end = 0;
        int cstart = 0, start = 0;
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if (sum <= 0) {
                sum = val;
                cstart = i;
            } else {
                sum += val;
            }
            if (sum > max) {
                max = sum;
                start = cstart;
                end = i;
            }
        }
        return list.subList(start,end+1);
    }
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-5, 7, 2, 9, -3, -8, 12, -5, 11, -4);

        List<Integer> ll = maxSubArray(numbers);
        System.out.println(ll);

/*
        int sum = 0;
        for (int a = 0; a<numbers.length; a++) {
            if (numbers.length == 1) {
                System.out.println(a);
            } else  {
                sum = Math.max(sum, sum + numbers[a]);
            }
        }
*/



/*
        List<Integer> numbers = Arrays.asList(
                235, 62 ,23, 7,2, 3423, 21
        );

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3).forEach(System.out::println);


        List<Person> people = Arrays.asList(
                new Person("Pratik", 20),
                new Person("John", 20),
                new Person("Mike", 20),
                new Person("Ben", 20),
                new Person("Bose", 20)
        );
*/


/*
        fName
        lName
        hobby
*/



/*
        Function<Person, List<Object>> = people -> people.

        people.stream()
                .map( Person::getName)
                .collect(Collectors.groupingBy());
*/


    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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