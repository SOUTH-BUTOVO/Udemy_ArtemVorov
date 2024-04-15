package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class IdenticalWords {
    /* 3. Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
        Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
        а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран. */

    void dictionaryWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] massWords = new String[5];
        int[] massNum = new int[massWords.length];
        Map<String, Integer> map = new TreeMap<>();
        System.out.println("Введите 5 слов.");
        // Заполняем массив словами.
        for (int i = 0; i < massWords.length; i++) {
            String word = reader.readLine();
            massWords[i] = word;
        }
        int count = 0;
        for (String s : massWords) {
            count++;
        }
        System.out.println();


        System.out.println(Arrays.toString(massWords));
        System.out.println(Arrays.toString(massNum));
    }
}
