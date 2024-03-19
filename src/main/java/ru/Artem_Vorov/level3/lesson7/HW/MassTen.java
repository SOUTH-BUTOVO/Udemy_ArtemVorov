package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MassTen {

    void mass() throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 цифр, для заполнения массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr) + " Origin");

        int maxNum = arr[0];
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                //i++;

                //continue;
            }

        }
        System.out.print(maxNum);
    }
}
