package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

import java.util.HashMap;
import java.util.Map;

public class NullPointerMapEx {
    /* 5 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        Map<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null); */
    void exception() {
        Map<String, String> map = null;
        try {
            map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }
        System.out.println(map);
    }
}
