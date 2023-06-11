package com.temp.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

    // main driver method
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src\\main\\resources\\serialize.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();

        System.out.println("Deserialized Object Value: " + person.getI() + "..." + person.getJ());
    }
}