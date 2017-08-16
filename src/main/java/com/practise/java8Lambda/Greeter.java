package com.practise.java8Lambda;

/**
 * Created by AmbaniP on 11/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

//      1. Replaced newly created interface MyLambda with existing one Greeting
//      MyLambda myLambdaFunction = () -> System.out.println("Print this message");
        Greeting myLambdaGreeting = () -> System.out.println("Print this message from lambda");
        System.out.println(myLambdaGreeting.toString());
        myLambdaGreeting.perform();

//      2. Moved myAdd method to Greeting
        MyAdd addFunction = (int a, int b) -> a + b;
        System.out.println("addFunction: " + addFunction);
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}

/* No more required
interface MyLambda {
    void foo();
}
*/

interface MyAdd {
    int summation(int a, int b);
}



