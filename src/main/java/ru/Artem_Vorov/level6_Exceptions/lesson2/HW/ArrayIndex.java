package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

import java.util.Arrays;

public class ArrayIndex {
    /* 3 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int[] m = new int[2];
        m[8] = 5; */

    void exception() {
        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException, обращение к несуществующему индексу массива. " +
                    "Длинна массива = " + m.length + " / " + e.getMessage());
        }
        System.out.println(Arrays.toString(m));

    }
}
