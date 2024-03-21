package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrtValue {
    Map<String, String> strMap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        System.out.println("Введите 3 пары (ключ : значение), для заполнения Map и вывода значений");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите кюч:");
            String key = reader.readLine();
            System.out.println("Введите значение:");
            String value = reader.readLine();
            map.put(key, value);
        }
        return map;
    }

    void printValues(Map<String, String> map) {
        map.forEach((k, v) -> System.out.println(v + ": Значение пары, коллекции Map"));
        System.out.println(".....");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + "| Значение пары, коллекции Map");
        }
    }
}
