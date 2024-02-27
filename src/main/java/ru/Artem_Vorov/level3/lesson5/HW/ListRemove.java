package ru.Artem_Vorov.level3.lesson5.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListRemove {
    static void listStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        System.out.println("Введите 5 строк, для заполнения листа:");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        System.out.println(list + " Origin");

        for (int i = 0; i < list.size(); i++) {
            String strSaveRemove = list.remove(list.size() - 1);
            list.add(0, strSaveRemove);
        }
        for (String str : list) {
            System.out.print(str + "  ");
        }
        System.out.println();

        list.remove(2);
        System.out.println(list);
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + "  ");
        }

    }
}
