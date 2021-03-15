package com.unit3practise;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class MethodReferenceExample1 {

    public static void main(String args[]) {
        Thread thread1 = new Thread(() -> printMessage());
        Thread thread2 = new Thread(MethodReferenceExample1::printMessage);
        thread1.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
