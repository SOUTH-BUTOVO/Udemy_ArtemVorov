package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

/* 1. Задача по алгоритмам. Найти ряд Фибоначчи для числа 10 */

import java.util.Arrays;

public class Fibonacci {

    void fi() {

        int numFibonacci = 28;
        int[] mass = new int[numFibonacci];
        mass[0] = 0;
        mass[1] = 1;
        for (int i = 2; i < mass.length; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n" + mass.length);
        System.out.println();
        System.out.println(Arrays.toString(mass));
    }
}
