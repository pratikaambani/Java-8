package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void LocalDateTimeApi() {

        System.out.println("Not thread safe : Unlike old java.util.Date which is not thread safe the new date-time API is immutable and doesn’t have setter methods.\n");

        System.out.printf("Less operations : In old API there are only few date operations but the new API provides us with many date operations.\n");

        System.out.println("Local : Simplified date-time API with no complexity of timezone handling.\n" +
                "Zoned : Specialized date-time API to deal with various timezones.\n" +
                "LocalDate/LocatTime and LocalDateTime API : Use it when time zones are NOT required.\n");

        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("the current date is " + date);


        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is " + time);


        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : " + current);


        // to print in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);
        System.out.println("in formatted manner " + formatedDateTime);


        // printing months days and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);


        // printing some specified date
        LocalDate date2 = LocalDate.of(1950, 1, 26);
        System.out.println("the republic day :" + date2);


        // printing date with current time.
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with " + "current time : " + specificDate);
    }

    public static void main(String[] args) {
        LocalDateTimeApi();
    }

}
