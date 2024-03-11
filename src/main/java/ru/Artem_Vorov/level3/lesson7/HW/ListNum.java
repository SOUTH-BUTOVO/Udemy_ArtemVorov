package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListNum {

    List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество цифр для заполнения списка:");
        int listSize = Integer.parseInt(reader.readLine());
        System.out.println("Размер списка составит: " + listSize + " цифры.");
        for (int i = 0; i < listSize; i++) {
            System.out.println("Введите цифру № " + (i + 1));
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(list + " - Origin");
        return list;
    }

    void getMinimum(List<Integer> list) {
        int maxNum = list.get(0);
        int maxIndex = 0;
        int minNum = list.get(0);
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxNum < list.get(i)) {
                maxNum = list.get(i);
                maxIndex = i;
            }
            if (minNum > list.get(i)) {
                minNum = list.get(i);
                minIndex = i;
            }
        }
        System.out.println(maxNum + " - Max num list");
        System.out.println(maxIndex + " - Index");
        System.out.println(minNum + " - Min num list");
        System.out.println(minIndex + " - Index");
    }
}
