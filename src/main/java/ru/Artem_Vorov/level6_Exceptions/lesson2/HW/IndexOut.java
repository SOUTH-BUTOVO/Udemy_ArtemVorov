package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

import java.util.ArrayList;
import java.util.List;

public class IndexOut {
    /* 4 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        List<String> list = new ArrayList<String>();
        String s = list.get(18); */

    void exception() {
        List<String> list = new ArrayList<>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException, длинна листа = 0. " + e.getMessage());
        }
        System.out.println(list);
    }
}
