package ru.Artem_Vorov.level1_Java_basic.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW13_Main {

    static void massUpTen() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void massDownFirst() {
        int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 10 - i;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void massFillingUp() {
        int[] arr1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 10 + i;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void massFillingDown() {
        int[] arr1 = {29, 28, 27, 26, 25, 24, 23, 22, 21, 20};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 29 - i;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void enterStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            String str = reader.readLine();
            arr[i] = str;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));
    }

    static void enterNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));
    }

    static void massSum() {
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 123;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма в массиве = " + sum);
    }

    static void massMinNum() {
        int[] arr = new int[10];
        //int[] arr = {4, 3, 5, 7, 4, 7, 9, 11, 4, 6, 21, 2};
        int min = arr[0];
        int minIndex = 0;
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * 3;
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
        System.out.println("Это число в массиве под индексом: " + maxIndex);
        System.out.println("Минимальное число в массиве = " + min);
        System.out.println("Это число в массиве под индексом: " + minIndex);
        System.out.println(Arrays.toString(arr));
    }

    static int[] initializeArray() throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static String maxNum(int[] arr) {
        int maxNum = arr[0];
        int indexNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                indexNum = i + 1;
            }
        }
        return "Максимальное число в массиве = " + maxNum + " Находящееся под № " + indexNum;
    }

    static void triangle() {
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {

        /* 1 - Создать и заполнить массив из 10 чисел, значениями от 1 до 10 */
        //massUpTen();
        System.out.println("-------------------------------");

        /* 2 - Создать и заполнить массив из 10 чисел, значениями от 10 до 1 */
        //massDownFirst();
        System.out.println("-------------------------------");

        /* 3 - Создать и заполнить массив из 10 чисел, значениями от 10 до 19 */
        //massFillingUp();
        System.out.println("-------------------------------");

        /* 4 - Создать и заполнить массив из 10 чисел, значениями от 29 до 20 */
        //massFillingDown();
        System.out.println("-------------------------------");

        /* 5 - Ввести 5 строк с клавиатуры и записать их в массив */
        //enterStr();
        System.out.println("-------------------------------");

        /* 6 - Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */
        //enterNum();
        System.out.println("-------------------------------");

        /* 7 - Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
        Посчитать сумму элементов массива и вывести её на экран. */
        //massSum();
        System.out.println("-------------------------------");

        /* 8 - Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
        Найти минимальный элемент в массиве и вывести его в консоль. */
        //massMinNum();
        System.out.println("-------------------------------");

        /* 9 - В методе initializeArray(); A. Создайте массив на 10 чисел.
        B. Считайте с консоли 10 чисел и заполните ими массив.
        C. Метод maxNum(int[] array) должен находить максимальное число из элементов массива.
        D. В выполняющем методе main выведите максимальное число в консоль */
        //System.out.println(maxNum(initializeArray()));
        System.out.println("-------------------------------");

        /* 10 - Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        Пример: 8
                8 8
                8 8 8
                .......*/
        triangle();
        System.out.println("-------------------------------");
    }
}
