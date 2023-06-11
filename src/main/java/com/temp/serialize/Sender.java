package com.temp.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setI(1);
        person.setJ(2);

        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\serialize.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
    }
}
