package ru.Artem_Vorov.level3.lesson1;

public class HW_L3L1_Main {

    static void doubleNum() {
        int[] arr = {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 1, 7, 6};
        int num = arr[0];
        int dub;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("В массиве у всех чисел есть дубль.");
                } else {
                    System.out.println("В массиве есть непарное число: " + num);
                }
            }
        }
    }

    static void mass() {
        int[] arr = {4, 12, 3, 5, 2};
        int maxNum = arr[0];
        int minNum = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i + 1;
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i + 1;
            }
        }
        System.out.println("Максимальное число в массиве = " + maxNum + " и находится под номером: " +
                maxIndex + " Минимальное число в массиве = " + minNum + " и находится под номером: " + minIndex);
    }

    public static void main(String[] args) {
        /* Задача по алгоритмам. Есть массив чисел, в котором все числа дублируются, кроме одного.
        Найдите число, которое не имеет дубликатов в массиве.
        Пример ввода: {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
        Пример вывода: 1 */
        //doubleNum();
        System.out.println("---------------");

        /* Создать массив на 5 чисел. Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
        Вывести на экран максимальное и минимальное числа через пробел. */
        mass();
    }
}
