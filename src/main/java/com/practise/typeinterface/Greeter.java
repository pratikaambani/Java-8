package com.practise.typeinterface;

/**
 * Created by AmbaniP on 15/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        //wiped out all garbage and directly aligned it with Interface.
        greeter.greet(() -> System.out.println("Print this message from lambda"));
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
