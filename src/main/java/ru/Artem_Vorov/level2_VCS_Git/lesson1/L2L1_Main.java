package ru.Artem_Vorov.level2_VCS_Git.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class L2L1_Main {
    static void enterNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int max = arr[0];
        // Заполняем массив вводом в консоль.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        // Сортировка
        Arrays.sort(arr);
        int[] arrRevers = new int[arr.length];
        for (int i = 0; i < arrRevers.length; i++) {
            arrRevers[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arrRevers));
    }

    public static void main(String[] args) throws IOException {
        /* Загрузить свой проект на GitHub */
        /* Написать программу, которая позволяет ввести с клавиатуры 5 чисел и выводит их в убывающем порядке. */
        enterNum();
        System.out.println("-------------------");

        /* Задание с собеседования:
        Missing number You are given a array of n-1 integers and these integers are in the range of 0 to n.
        There are no duplicates in array. One of the integers is missing in the array.
        Write an efficient code to find the missing integer. Example: I/P [0, 1, 2, 4, ,6, 3, 7, 8] O/P 5 */
    }
}
