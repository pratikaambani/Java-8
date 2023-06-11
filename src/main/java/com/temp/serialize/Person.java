package com.temp.serialize;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long SerialVersionUID = 1;

    private int i;
    private int j;
//    TODO: Default serialization will work but what
//     1. if we serialize using i and j
//     2. Deserialize by add k in same class
//    Sol: This will give InvalidClassException
//    Also, transient will not be serialized
//          static will not be serialized

/*
    private int k;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
*/

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
