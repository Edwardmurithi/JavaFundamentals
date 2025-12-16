package com.techwithedward.Dates;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        // display local date
        LocalDate myObj = LocalDate.now();
        // display local time
        LocalTime mytime = LocalTime.now();

        // display local date and time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formating " + myDateObj);

        // Formating date and time
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

        String formatedDate = myDateObj.format(myFormatObj);
        System.out.println("After formating: " + formatedDate);


    }
}
