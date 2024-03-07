package ru.Artem_Vorov.level3.lesson6.HW;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOfDay {
    void date() {
        Date date = new Date();
        Date dateNew = new Date();

        dateNew.setYear(124);
        dateNew.setMonth(2);
        dateNew.setDate(7);
        dateNew.setHours(0);
        dateNew.setMinutes(0);
        dateNew.setSeconds(0);

        long milSek = (dateNew.getTime() / 1000 / 60 / 60 / 24 / 365);

        long dataMilSek = date.getTime() - dateNew.getTime();


        System.out.println(dataMilSek + " - С начала суток прошло миллисекунд.");
        System.out.println((dataMilSek / 1000) + " - С начала суток прошло секунд.");
        System.out.println((dataMilSek / 1000 / 60) + " - С начала суток прошло минут.");
        System.out.println((dataMilSek / 1000 / 60 / 60) + " - С начала суток прошло часов.");
        System.out.println( ((dataMilSek / 1000 / 60) / (dataMilSek / 1000 / 60 / 60)) + " - Сейчас времени от начала суток.");

        System.out.println(((dataMilSek / 1000 / 60) % 60) + " - minutes");

        System.out.println((dataMilSek / 1000 / 60 / 60) + " часов : " + (dataMilSek / 1000 / 60) % 60 +
                " минут Время от начала: 06 Марта 2024");

        System.out.println(2024 - milSek);

        System.out.println(dateNew.getTime());

        System.out.println(dateNew);

        LocalDate oldDate = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate nowDate = LocalDate.now();
        //oldDate.withYear(123);
        System.out.println(ChronoUnit.DAYS.between(oldDate, nowDate) + " - Количество дней с начала 2024 года");

    }
}
