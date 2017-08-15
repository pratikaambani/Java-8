package com.practise.java8;

/**
 * Created by AmbaniP on 15/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());


    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
