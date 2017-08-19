package com.unit2practise.java8Predicates;

/**
 * Created by AmbaniP on 18/08/2017.
 */
public class ClosureExample {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                b = 40;
                System.out.println("i: " +(i+b));
            }
        });
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}