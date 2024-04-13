package ru.Artem_Vorov.level5_Java_core.lesson1.HW;

public class BinaryRecursive {

    int searchBinaryRecursive(int[] mass, int left, int right, int valueToFind) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (mass[mid] == valueToFind) {
                return mid;
            }

            if (mass[mid] < valueToFind) {
                return searchBinaryRecursive(mass, mid + 1, right, valueToFind);
            } else {
                return searchBinaryRecursive(mass, mid - 1, left, valueToFind);
            }
        }
        return -1;
    }
}
