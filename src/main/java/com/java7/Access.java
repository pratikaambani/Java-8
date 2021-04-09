package com.java7;

class Access {
    static int x = 11;
    private int y = 33;

    public static void main(String[] args) {
        Access t = new Access();
        t.method1(5);
    }

    public void method1(int x) {
        Access t = new Access();
        Access.x = 22;
        y = 44;

        System.out.println("Test.x: " + Access.x);
        System.out.println("t.x: " + Access.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

}