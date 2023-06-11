package com.defaultstatic;

public interface IAddress1 {

    boolean hasAddress();

    default String getCountryCapitol(String country) {
        if (country.equalsIgnoreCase("India")) {
            return "Delhi";
        } else {
            return "Who cares!";
            
        }
    }

    //02. Static Methods are similar to Default methods, but the only thing is, implementing classes cannot override the behaviour of the static method.
    // This makes the system more standard instead of having each class its own implementation and introduction problems.
    static int getPinCode() {
        return 382330;
    }

}
