package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListTwoNum {

    void twoNumShift() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число, сколько будет строк:");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число, сколько раз будет смещение первого числа в конец:");
        int M = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Введите строку для заполнения листа:");
            list.add(reader.readLine());
        }
        System.out.println(list + " - Origin");
        List<String> shift = new ArrayList<>(list);
        for (int i = 0; i < M; i++) {
            shift.remove(0);
            for (int j = 0; j < 1; j++) {
                shift.add(list.get((j + i)));
            }
        }
        System.out.println(shift + " - Shift");
    }
}
