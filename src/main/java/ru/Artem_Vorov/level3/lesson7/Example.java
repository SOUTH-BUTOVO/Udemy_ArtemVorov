package ru.Artem_Vorov.level3.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(17, "text1");
        map.put(19, "text2");
        map.put(16, "text7");
        map.put(null, "text5");
        map.put(4, "text3");
        map.put(35, "text4");
        map.put(0, "text6");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
