package com.defaultstatic;

public interface IAddress2 {

    boolean hasAddress();

    default String getCountryCapitol(String country) {
        if (country.equalsIgnoreCase("UK")) {
            return "London";
        } else {
            return "Who cares!";
        }
    }

    static int getPinCode() {
        return 101010;
    }

}
