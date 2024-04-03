package ru.Artem_Vorov.level4.lesson1;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        User user1 = new User("Jhon", 24, 3000);
        User user2 = new User("Mark", 36, 3500);

        System.out.println(user1.compareTo(user2));

        Map<User, String> map = new TreeMap<>();
        map.put(user1, "text1");
        map.put(user2, "text2");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
