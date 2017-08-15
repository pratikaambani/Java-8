package com.practise.java8Lambda;

interface MyLambda {
    void foo();
}

/**
 * Created by AmbaniP on 15/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());

        MyLambda myLambdaFunction = () -> System.out.println("Print this message");
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
