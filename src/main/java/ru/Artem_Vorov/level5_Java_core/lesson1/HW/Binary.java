package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

/* 2. Задача по алгоритмам. Реализовать алгоритм бинарного поиска (загугли, разберись что это и реализуй) */

import java.util.Arrays;

public class Binary {

    void binarySearch() {
        int[] mass = {0, 1, 1, 2, 3, 4, 7, 10, 12, 13, 15};
        Arrays.sort(mass);
        int valueToFind = 5;

        int left = 0;
        int right = mass.length - 1;
        int index = 0;
        int massMid;

        while (left <= right) {
            if (left ==-1) {
                System.out.println("Число: " + valueToFind + ", в массиве не найдено.");
            break;
            }
            massMid = left + (right - left) / 2;
            if (mass[massMid] < valueToFind) {
                left = massMid + 1;
            } else if (mass[massMid] > valueToFind) {
                right = massMid - 1;
                //break;
            } else {
                index = massMid;
                //System.out.println("Число: " + valueToFind + ", в массиве не найдено.");
                break;
            }
        }
        System.out.println("Искомое число: " + mass[index] + ", найдено в массиве под №: " + (index + 1));
        System.out.println(mass.length + " length mass");
    }
}
