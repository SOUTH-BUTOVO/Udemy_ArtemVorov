package ru.Artem_Vorov.level3.lesson8.HW;

/* 3 Удалить людей, имеющих одинаковые имена.
        Создать словарь (Map<String, String>) занести в него десять записей по принципу:
        «фамилия» - «имя».
        Удалить людей, имеющих одинаковые имена. */

import java.util.*;

public class DictionaryRemoveName {

    Map<String, String> dictionary() {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristian");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Piero", "Aleks");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }

    void removeName(Map<String, String> map) {
        for (Map.Entry dictionary : map.entrySet()) {
            String[] value = new String[] {dictionary.getValue().toString()};

            System.out.println(Arrays.toString(value));
        }


        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getValue());
        }

    }
}
