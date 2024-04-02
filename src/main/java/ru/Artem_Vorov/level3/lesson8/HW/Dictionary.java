package ru.Artem_Vorov.level3.lesson8.HW;

/* 1 Создать словарь (Map<String, String>) занести в него 5 записей по принципу «Фамилия» - «Имя».
        Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
        - создать метод getCountTheSameFirstName(Map<String, String> map, String name), который должен
        вернуть количество пар с именем, которое приходит в аргумент name.
        - создать метод getCountTheSameLastName(Map<String, String> map, String lastName), который должен
        вернуть количество пар с фамилией, которая приходит в аргумент lastName. */

import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionary {
    void dictionaryFamily() {
        String family = "Самойлович";
        String name = "Сергей";
        int coincidenceFamily = 0;
        int coincidenceName = 0;

        Map<String, String> map = new LinkedHashMap<>();
        map.put("Самойлович", "Сергей");
        map.put("Куликов", "Александр");
        map.put("Волков", "Евгений");
        map.put("Жерноклеев", "Андрей");
        map.put("Ширшов", "Сергей");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (family.equals(entry.getKey())) {
                coincidenceFamily ++;
            } //else System.out.println("Нет совпадений Фамилии из списка");
            if (name.equals(entry.getValue())) {
                coincidenceName ++;
            } //else System.out.println("Нет совпадений Имени из списка");

        }
        System.out.println("Есть совпадение Фамилии " + family + ", из списка: " + coincidenceFamily);
        System.out.println("Есть совпадение Имени " + name + ", из списка: " + coincidenceName);

        Example1 example = new Example1();
        example.dictionary();
    }

    void getCountTheSameFirstName(Map<String, String> map, String searchFamily) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (searchFamily.equals(entry.getKey())) {
                System.out.println("Искомая Фамилия: " +
                        searchFamily + ", была найдена в паре: " + entry.getKey() + " " + entry.getValue());
            }
        }
    }

    void getCountTheSameLastName(Map<String, String> map, String searchName) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (searchName.equals(entry.getValue())) {
                System.out.println("Искомое Имя: " +
                        searchName + ", было найдено в паре: " + entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
