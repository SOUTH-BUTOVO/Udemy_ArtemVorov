package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

import java.util.Arrays;

public class Binary2 {
    int binarySearch2(int[] mass, int valueToFind) {
        Arrays.sort(mass);
        int left = 0;
        int right = mass.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mass[mid] < valueToFind) {
                left = mid + 1;
            } else if (mass[mid] > valueToFind) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
