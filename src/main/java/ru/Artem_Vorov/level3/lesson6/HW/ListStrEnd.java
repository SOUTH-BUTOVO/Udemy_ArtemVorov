package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListStrEnd {
    void listStrEnd() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0;  ; i++) {
            System.out.println("Введите строку для добавления в Лист или end, для выхода:");
            String str = reader.readLine();
            if ((str.equals("end"))) break;
            list.add(str);
        }
        System.out.println(list);
    }
}
