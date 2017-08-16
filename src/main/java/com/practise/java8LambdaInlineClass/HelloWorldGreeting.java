package com.practise.java8LambdaInlineClass;

/**
 * Created by AmbaniP on 11/08/2017.
 */
public class HelloWorldGreeting implements Greeting {
    public void perform() {
        System.out.println("Print this message, but won't be printed unless called from Greeter");
    }
}
