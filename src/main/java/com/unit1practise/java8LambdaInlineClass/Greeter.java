package com.unit1practise.java8LambdaInlineClass;

/**
 * Created by AmbaniP on 11/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();

        //removing below after using inner class
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.perform();
        Greeting myLambdaGreeting = () -> System.out.println("Print this message from lambda");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("This message is from innerclass");
            }
        };

        myLambdaGreeting.perform();
        innerClassGreeting.perform();

        greeter.greet(myLambdaGreeting);
        greeter.greet(innerClassGreeting);

    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }

}
