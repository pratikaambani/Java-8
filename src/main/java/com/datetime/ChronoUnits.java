package com.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnits {
    // Function to check ChronoUnit
    public static void checkingChronoEnum() {

        System.out.println("ChronoUnits Enum : java.time.temporal.ChronoUnit enum is added in Java 8 to replace integer values used in old API to represent day, month etc.\n");

        LocalDate date = LocalDate.now();
        System.out.println("current date is :" + date);


        // adding 2 years to the current date
        LocalDate year = date.plus(2, ChronoUnit.YEARS);
        System.out.println("next to next year is " + year);


        // adding 1 month to the current data
        LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
        System.out.println("the next month is " + nextMonth);


        // adding 1 week to the current date
        LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
        System.out.println("next week is " + nextWeek);


        // adding 2 decades to the current date
        LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
        System.out.println("20 years after today " + Decade);
    }

    // Driver code
    public static void main(String[] args) {
        checkingChronoEnum();
    }

}

