package com.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        //this throws nullpointerexception
        //withoutoptional();

        withoptional();

        Optional<String> ss = Optional.ofNullable(null);
        System.out.println(ss.isPresent());
        System.out.println(java.util.Optional.empty().equals(ss));
    }

    private static void withoptional() {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else

            System.out.println("word is null");
    }


    private static void withoutoptional() {
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);
    }
}
