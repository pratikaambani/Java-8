package com.java8;

public class Samples {

    public static void main(String[] args) {

        Runnable rr = () -> System.out.println("India");
        Runnable rr1 = () -> System.out.println("INDIA");
        rr.run();

        Samples ss = new Samples();
        System.out.println(ss.thisOne());

        int a=1,b=2,c=3;
        a|=2;
        b>>=2;
        c<<=2;
//        a^=c;
        System.out.println(a );
        System.out.println(b);
        System.out.println(c);
    }

    private int thisOne() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
