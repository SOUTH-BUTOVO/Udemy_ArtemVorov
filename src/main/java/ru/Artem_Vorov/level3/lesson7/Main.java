package ru.Artem_Vorov.level3.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("text1", 5);
        map.put("text1", 7);
        map.put("text2", 7);
        map.put("null", 9);
        map.put(null, 11);
        map.put(null, null);

        System.out.println(map + " ---map");
        System.out.println(1 << 4);

        //Iterator<String> iterator = iterator.hasNext();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> str = iterator.next();
            System.out.println(str);
        }

        for (Map.Entry<String, Integer> str : map.entrySet()) {
            String key = str.getKey();
            Integer value = str.getValue();
            //System.out.println(key + " ---key");
            //System.out.println(str.getKey() + " ---key");
            //System.out.println(value + " ---value");
            //System.out.println(str + " ---str");
        }
    }
}
