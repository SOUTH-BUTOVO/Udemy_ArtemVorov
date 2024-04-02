package ru.Artem_Vorov.level3.lesson8.HW;

/* 3 Удалить людей, имеющих одинаковые имена.
        Создать словарь (Map<String, String>) занести в него десять записей по принципу:
        «фамилия» - «имя».
        Удалить людей, имеющих одинаковые имена. */

import java.util.*;

public class DictionaryRemoveName {

    Map<String, String> dictionary() {
        Map<String, String> map = new TreeMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }

    void removeName(Map<String, String> map) {
        for (Map.Entry dictionary : map.entrySet()) {
            String[] value = new String[] {dictionary.getValue().toString()};
            for (int i = 0; i < value.length; i++) {

                //if (value(i).equals())
            }
            System.out.println(Arrays.toString(value));
        }
    }
}
