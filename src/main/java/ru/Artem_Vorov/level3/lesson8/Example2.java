package ru.Artem_Vorov.level3.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<User, String> map = new HashMap<>();
        map.put(new User(33, 3000), "Alex");
        map.put(new User(33, 3000), "Boris");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
