package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

/* 2. Задача по алгоритмам. Реализовать алгоритм бинарного поиска (загугли, разберись что это и реализуй) */

public class Binary {

    void binarySearch() {
        int[] mass = {0, 1, 1, 2, 3, 4, 7, 10, 12, 13, 15};
        int valueToFind = 10;

        int low = 0;
        int high = mass.length-1;
        int index = -1;
        int midMass;

        while (low <= high) {
            midMass = low + (high - low) / 2;
            if (mass[midMass] < valueToFind) {
                low = midMass + 1;
            } else if (mass[midMass] > valueToFind) {
                high = midMass - 1;
                //break;
            } else {
                index = midMass;
                //System.out.println("Число: " + valueToFind + ", в массиве не найдено.");
                break;
            }
        }
        System.out.println((index + 1) + " search num");
        System.out.println(mass.length + " length mass");
    }
}
