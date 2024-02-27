package ru.Artem_Vorov.level3.lesson5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date date2 = new Date();
        date.setYear(125);
        date.setMonth(5);
        System.out.println(date.before(date2));
        System.err.println("1 - " + date.getTime());

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("1 - " + date);

        System.out.println("2 - " + localDate);
        System.out.println("3 - " + localDateTime);
        System.out.println("4 - " + localTime);

        LocalDate localDate2 = LocalDate.of(1986, 6, 26);
        LocalDateTime localDate3 = LocalDateTime.of
                (1986, 6, 26, 12, 12, 12, 1);
        System.err.println("5 - " + localDate2);
        System.err.println("6 - " + localDate3);
    }
}
