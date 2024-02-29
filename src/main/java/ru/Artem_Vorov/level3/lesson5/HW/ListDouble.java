package ru.Artem_Vorov.level3.lesson5.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListDouble {
    static void doubleValues() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 слов, для заполнения массива:");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (String s : list) {
            System.out.print(s + " ");
            System.out.println(s);
        }
    }
}
