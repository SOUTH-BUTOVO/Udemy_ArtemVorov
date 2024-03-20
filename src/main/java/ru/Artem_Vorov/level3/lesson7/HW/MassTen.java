package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MassTen {

    void mass() throws IOException {
        int[] arr = new int[10];
        int[] arrMaxNum = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 цифр, для заполнения массива:");

        // Создаём и заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr) + " Origin");

        int maxNum = arr[0];
        int indexMaxNum = 0;

        // Нашёл максимальное число в массиве
        for (int i = 0; i < arr.length; i++) {
            //if (i == index) continue;
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                indexMaxNum = i;
            }
        }

        // Нахождение 5 максимальных чисел, будем делать через сортировку
        Arrays.sort(arr);
        for (int i = 5; i < arr.length; i++) {
            arrMaxNum[i - 5] = arr[i];
        }
        System.out.print(maxNum + " Max num in mass ," + indexMaxNum + " index max num" + "\n");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrMaxNum));
    }
}
