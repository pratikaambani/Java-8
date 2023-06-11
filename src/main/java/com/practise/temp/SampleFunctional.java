package com.practise.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SampleFunctional {

    public static void main(String[] args) {
        //    001.
//        I1 i1 = () -> "System.out.println";

//    002.
/*
    I1 i1 = () -> new ArrayList<>(
            Arrays.asList(
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 0
            )
    );
*/

//    003.
//    I1 i1 = (a) -> a*a;

//    004.
//    I1 i1 = (a, b, c) -> a+b+c;

        I1 i1 = (a, b, c) -> a+b+c;
        int aa = i1.getValues(1, 2, 3);

        BiFunction<Integer, Integer, Integer> bb = (a, b) -> (a*b);


        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("biFunction: " +biFunction.apply(65,34));


    }
}


@FunctionalInterface
interface I1 {

//    001.
//    String getValues();

//    002.
//    List<Integer> getValues();

//    003.
//    Integer getValues(int a);

//    004.
//    Integer getValues(int a, int b, int c);

    int getValues(int a, int b, int c);

}

