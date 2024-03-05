package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListNumReverse {
    void numReverse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        System.out.println("Введите 5 чисел для заполнения листа:");
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        System.out.println(list + " - Origin");
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        System.out.println(reverse + " - Reverse");
    }
}
