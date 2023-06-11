package com.defaultmethod;

public class AddressImpl implements IAddress1, IAddress2 {

    @Override
    public boolean hasAddress() {
        return true;
    }

    //01. We are overriding below method as well,
    //  a. If this method is available in only 1 interface no need to override
    //  b. If this method is available in both the interfaces class is implementing, mandatory to implement the method in class
    @Override
    public String getCountryCapitol(String country) {
        if (country.equalsIgnoreCase("SriLanka")) {
            return "Colombo";
        } else {
            return "Who cares!";
        }
    }

    //02. Static Methods are similar to Default methods,
    // but the only thing is implementing classes cannot override the behaviour of the static method.
    // This makes the system more standard instead of having each class its own implementation and introduction problems.
    int getPinCode() {
        IAddress1.getPinCode();
        IAddress2.getPinCode();
        return 382330;
    }


/*
    Abstract Classes:
        If you want methods with access modifiers other than public
        If you have more common methods
        If you want non-static, non-final fields
        If you want common code for the same group of classes
    Interfaces:
        If you want to have multiple inheritance
        If you want to have a common behaviour to all the implementations
        If your interface is used by a different group of unrelated classes.
*/

}
