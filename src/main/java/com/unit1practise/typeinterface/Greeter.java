package com.unit1practise.typeinterface;

/**
 * Created by AmbaniP on 11/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();

        StringLengthLambda myLambda1 = (String s) -> s.length();
        System.out.println("myLambda1: " + myLambda1.getLength("length of this string"));

        //String not required because it can infer type from interface
        StringLengthLambda myLambda2 = (s) -> s.length();
        System.out.println("myLambda2: " + myLambda2.getLength("length of this string"));

        // no need to specify parantheses when one argument
        StringLengthLambda myLambda3 = s -> s.length();
        System.out.println("myLambda3: " + myLambda3.getLength("length of this string"));

        getLength(s -> s.length());
    }

    public static void getLength(StringLengthLambda l) {
        System.out.println(l.getLength("Length of this string"));
    }

}

interface StringLengthLambda {
    int getLength(String s);
}