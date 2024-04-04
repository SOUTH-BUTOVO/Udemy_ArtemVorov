package ru.Artem_Vorov.level4.lesson1.HW;

/* Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
        Вывести результат на экран. Используй метод класса String - toCharArray(); Пример ввода:
            String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            String text2 = "абв";
            String text3 = "ддд";
            String text4 = "яяа";
            String text5 = "вввв";
            Пример вывода:
            а 3
            б 2
            в 6
            г 1
            д 4
            …
            я 3 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.String;

public class StringNumLetter {

    // Создаём массив, с 5 строками.
    String[] stringMass() throws IOException {
        String[] mass = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите 5 строк:");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (reader.readLine());
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(mass.length);

        // Объединяем массив с 5 строками, в массив размером 1.
        //String joined = String.join(" ", mass);
        String[] massLong = new String[] {Arrays.toString(mass)};
        System.out.println(massLong.length);
        return massLong;
    }


    void numLetter(String[] mass) {
        String str;
        List<String> list = List.of(mass);
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
        System.out.println(mass[0]);
    }
}
