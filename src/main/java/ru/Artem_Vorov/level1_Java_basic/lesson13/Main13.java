package ru.Artem_Vorov.level1_Java_basic.lesson13;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 30;
        arr[6] = 20;
        System.out.println(arr[0]);
        System.out.println("----------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        int[][] array = new int[4][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        int[] mass = {3, 1, 0, 1, 5, 6, 9, 4, 0, 7, 2, 8};
        System.out.println(Arrays.toString(mass) + " - Origin mass");
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass) + " - " + mass.length);
        System.out.println("----------------------");
    }
}
