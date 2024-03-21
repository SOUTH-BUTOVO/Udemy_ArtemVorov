package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrtKey {
    Map<String, String> strMap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        System.out.println("Введите 3 пары строк (ключ - значение), для заполнения коллекции Map и вывода ключей:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите ключ: ");
            String key = reader.readLine();
            System.out.print("Введите значение: ");
            String value = reader.readLine();
            map.put(key, value);
        }
        return map;
    }

    void printKeys(Map<String, String> map) {
        map.forEach((k, v) -> System.out.println(k + ": Ключ пары, коллекции Map"));
        System.out.println(".....");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "| Ключ пары, коллекции Map");
        }
    }
}
