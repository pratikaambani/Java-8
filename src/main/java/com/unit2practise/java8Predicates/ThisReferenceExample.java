package com.unit2practise.java8Predicates;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class ThisReferenceExample {

    //not a static method
    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String args[]) {
        ThisReferenceExample example = new ThisReferenceExample();
        //can not access
        //System.out.println(this);
        //1. innerclass
        example.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i: " +i);
                System.out.println(this);
            }

            public String toString() {
                return "This is anonymous inner class.";
            }
        });

        //1. lambda
        //beavious of this is different with lambda than inner class
        example.doProcess(10, i -> {
            System.out.println("Inside lambda");
            //System.out.println(this);
        });
    }

}
