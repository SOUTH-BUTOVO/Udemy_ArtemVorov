package ru.Artem_Vorov.level3.lesson8.HW;

import java.time.Month;
import java.util.*;

public class DictionaryRemove {

    Map<String, Date> dictionary() {
        Map<String, Date> map = new LinkedHashMap<>();
        map.put("Jhon", new Date(1980, Calendar.JUNE, 1));
        map.put("Mark", new Date(1999, Calendar.JULY, 5));
        map.put("Elon", new Date(1996, Calendar.DECEMBER, 13));
        map.put("Stiven", new Date("AUGUST 3 1980"));
        map.put("Brook", new Date("JUNE 11 1986"));
        map.put("Clark", new Date("MARCH 1 1980"));
        // Работает, как отдельные даты, так и запись в String.)))
        return map;
    }


    void humanRemove(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Date> entry = it.next();
            if (entry.getValue().getMonth() == Calendar.JUNE ||
                entry.getValue().getMonth() == Calendar.JULY ||
                entry.getValue().getMonth() == Calendar.AUGUST) {
                it.remove();
            }
            //System.out.println(entry);
        }
        System.out.println(map);
    }
}
