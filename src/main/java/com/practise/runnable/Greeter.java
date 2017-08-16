package com.practise.runnable;

/**
 * Created by AmbaniP on 11/08/2017.
 */
public class Greeter {

    public static void main(String args[]) {

/*

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread myThread = new Thread(runnable);
*/
        //Instead of above implementation, directly we'll write

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is inside run() of Runnable");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed from Lambda expression"));
        myLambdaThread.run();

    }
}

