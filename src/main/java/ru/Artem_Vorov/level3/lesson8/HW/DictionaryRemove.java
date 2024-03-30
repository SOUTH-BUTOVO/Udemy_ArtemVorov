package ru.Artem_Vorov.level3.lesson8.HW;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class DictionaryRemove {
    private Map<String, Date> map = Map.of(
            "Jhon", new Date(1980, Calendar.JUNE, 1),
            "Mark", new Date(1999, Calendar.JUNE, 5),
            "Elon", new Date(1996, Calendar.DECEMBER, 13),
            "Stieve", new Date("JUNE 1 1980"),
            "Clark", new Date("MARCH 1 1980"));


    void humanRemove() {
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            if (entry.getValue().equals(Calendar.JUNE)) {
                System.out.println(1);
            }
        }
    }
}
