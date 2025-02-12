/*
    Using java 8 date/time api:
        1. WAP to get two dates from user and print if the first date occurs before or after the second date supplied by the user.
        2. WAP to print current date and time in 3 different time zones.
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Question-1
        Scanner sc = new Scanner(System.in);
        LocalDate date1 = LocalDate.parse(sc.nextLine());
        LocalDate date2 = LocalDate.parse(sc.nextLine());
        if(date1.isBefore(date2)){
            System.out.println("Date 1 : " + date1 + " is before, Date 2 : " + date2);
        } else {
            System.out.println("Date 1 : " + date1 + " is after, Date 2 : " + date2);
        }

        // Question-2
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Paris")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
    }
}
