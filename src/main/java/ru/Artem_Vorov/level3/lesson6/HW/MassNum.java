package ru.Artem_Vorov.level3.lesson6.HW;

import java.util.Arrays;

public class MassNum {

    void massArr(int[] arr) {
        System.out.println(Arrays.toString(arr) + " - Origin");

        int minNum = arr[0];
        int minIndex = 0;
        int maxNum = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("-----------------");
        System.out.println("Min num mass = " + minNum);
        System.out.println("Index Min num = " + minIndex);
        System.out.println("-----------------");
        System.out.println("Max num mass = " + maxNum);
        System.out.println("Index Max num = " + maxIndex);
    }
}
