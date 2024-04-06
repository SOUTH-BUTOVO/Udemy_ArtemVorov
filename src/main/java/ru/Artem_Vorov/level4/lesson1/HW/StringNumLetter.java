package ru.Artem_Vorov.level4.lesson1.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.String;

public class StringNumLetter {

    // Создаём массив, с 5 строками.
    List<String> stringMass() throws IOException {
        String[] mass = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите 5 строк:");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (reader.readLine());
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(mass.length);

        // Объединяем массив с 5 строками, в массив размером 1.
        return List.of(mass);
    }


    void numLetter(List<String> list) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : list) {
            System.out.println(word);
            char[] chars = word.toLowerCase().toCharArray();

            for (char ch : chars) {
                Integer count = map.get(ch);
                map.put(ch, (count == null ? 1 : count + 1));
            }
        }
        System.out.println("Result: ");
        for (Character c : map.keySet()){
            System.out.format("%c: %d%n", c, map.get(c));
        }
        System.out.println(list + "!");
    }
}
