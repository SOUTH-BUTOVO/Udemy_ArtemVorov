package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListString {
    void str() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; ; i++) {
            System.out.println("Введите слово или ENTER для выхода из программы:");
            String newStr = reader.readLine();
            if (!newStr.equals("") && newStr.length() % 2 == 0) {
                //list.add(newStr + newStr);
                list.add(newStr);
                list.add(newStr);
                System.out.println(list);
                continue;
            } if (!newStr.equals("") && newStr.length() % 2 != 0) {
                list.add(newStr + newStr + newStr);
                System.out.println(list);
                continue;
            }
            System.out.println("Введена пустая строка, завершение программы.");
        break;
        }

    }
}
