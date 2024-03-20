package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FourMap {

    void strMap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        System.out.println("Введите 4 пары строк (ключ - значение), для заполнения коллекции Map:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите ключ: ");
            String key = reader.readLine();

            System.out.print("Введите значение: ");
            String value = reader.readLine();

            map.put(key, value);
        }
        for (String str : map) {

        }
        System.out.println(map);
    }
}
