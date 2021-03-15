package com.practiseprogram;

import java.util.function.Supplier;

/**
 * Created by Pratik Ambani on 5/11/2017.
 */
public class SupplierExample {
    public static void main(String[] args) {

        int a = 30;

        Supplier<String> supplierStr = () -> {
            return "Hello world.";
        };

        Supplier<Number> supplierNum = () -> {
            return a * 40;
        };

        Supplier<String> name  = ()-> "Partik Ambani";

        System.out.println(supplierStr.get());
        System.out.println(supplierNum.get());
        System.out.println(name.get());
    }
}
