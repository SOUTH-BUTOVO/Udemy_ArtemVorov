package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FiveWords {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    void strMass() throws IOException {
        String[] str = new String[5];
        System.out.println("Введите 5 слов для заполнения массива:");
        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

    void strSet() throws IOException {
        Set<String> set = new HashSet<>();
        System.out.println("Введите 5 слов для заполнения листа:");
        for (int i = 0; i < 5; i++) {
            set.add(reader.readLine());
        }
        System.out.println(set);
    }
}
