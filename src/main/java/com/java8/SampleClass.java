package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleClass {

    public static void main(String[] args) {

        List<Integer>[] ll = new ArrayList[5];
        Arrays.fill(ll, new ArrayList<>());

        ll[0].add(0);
        ll[1].add(1);
        ll[2].add(2);

        mapOperations();

//        occurrances();

//        filterAndMap();


//        duplicates();


//        remove negative numbers, multiply odd numbers with 2, retain even numbers
//        streamGame();

//        stream();

//        someTryCatch();
    }

    private static void mapOperations() {
        User user1 = new User(1, "name", "surname");
        User user2 = new User(1, "name", "surname");
        User user3 = new User(1, "name", "surname");
        HashMap<User, String> userMap = new HashMap<>();
        userMap.put(user1, "Employee");
        userMap.put(user2, "Student");
        userMap.put(user3, "Data");
        System.out.println(userMap.get(user2));

        String s1 = new String("A");
        String s2 = new String("A");
        String s3 = new String("A");
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put(s1, "Employee");
        stringMap.put(s2, "Student");
        stringMap.put(s3, "Data");
        System.out.println(stringMap.get(s2));
    }

    private static void occurrances() {
        String str = "wwwwaaadexxxxxxwww";
        char[] ss = str.toCharArray();
        int count = 1;
        for (int a = 0; a < ss.length; a++) {
            if (ss[a] == ss[a + 1] && count + 1 < ss.length) {
                count++;
            } else if (ss[a] != ss[a + 1]) {
                System.out.println(ss[a]);
                System.out.println(count);
                count = 1;
            }
        }
    }

    private static void filterAndMap() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List ll = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(ll);
    }

    private static void duplicates() {
        String str = "Fear leads to anger ; anger leads to hatred ; hatred leads to conflict ; conflict leads to suffering.";
        Map<String, Integer> mm = new HashMap<>();
        Arrays.stream(str.split(" "))
                .forEach(word -> mm.put(word, !mm.containsKey(word) ? 1 : mm.get(word) + 1));
//        Arrays.stream(words).forEach(word -> mm.put(word, !mm.containsKey(word) ? 1 : mm.get(word) + 1));
        System.out.println(mm);
    }

    private static void streamGame() {
        List<Integer> ls = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        Integer dd = ls.stream()
                .filter(num -> num > 0)
                .mapToInt(x -> x % 2 == 0 ? x * 2 : x).sum();
        System.out.println(dd);
    }

    private static void someTryCatch() {
        try {
/*
            List<Integer> members = Arrays.asList(1, 2, 3, 4, 5, 6);
            Stream<Integer> nn = members.stream().filter(number -> number > 3);
            members.removeIf(member -> member.equals(6));
            List<Integer> newList = nn.collect(Collectors.toList());
            System.out.println(newList);
*/
            throw new NullPointerException();
        } catch (NullPointerException npe) {
            System.out.println(npe);
            throw npe;
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        } catch (Exception e) {
            System.out.println(e);
        } catch (Throwable throwable) {
            System.out.println(throwable);
        } finally {
            System.out.println("Finally");
        }
    }

    private static void stream() {
        List<Integer> members = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> nn = members.stream().filter(number -> number > 3);
//        members.removeIf(member -> member==6);
        members.removeIf(member -> member > 3);
        List<Integer> newList = nn.collect(Collectors.toList());
        System.out.println(newList);
    }
}

class User {
    private int id;
    private String fName;
    private String lName;

    public User(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                fName.equals(user.fName) &&
                lName.equals(user.lName);
    }

/*
    @Override
    public int hashCode() {
        return Objects.hash(id, fName, lName);
    }
*/
}


class CustomStack<T> {
    private CustomStack<T>[] elements;
    private CustomStack<T> top;

    public void push(CustomStack<T> el){

    }

    public int pop(){
        return 4;
    }

}