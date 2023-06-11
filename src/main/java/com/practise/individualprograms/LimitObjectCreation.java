package com.practise.individualprograms;

class Singleton {

    public static int objCount = 0;
    private static Singleton limInstance;

    private Singleton() {
        objCount++;
    }

    public static synchronized Singleton getLimInstance() {
        if (objCount < 3) {
            limInstance = new Singleton();
        }
        return limInstance;
    }
}

public class LimitObjectCreation {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getLimInstance();
        Singleton obj2 = Singleton.getLimInstance();
        Singleton obj3 = Singleton.getLimInstance();
        Singleton obj4 = Singleton.getLimInstance();
        Singleton obj5 = Singleton.getLimInstance();
        Singleton obj6 = Singleton.getLimInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        //TODO: This will be repeated
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
    }
}
