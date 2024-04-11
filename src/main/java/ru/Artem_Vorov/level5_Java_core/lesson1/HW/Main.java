package ru.Artem_Vorov.level5_Java_core.lesson1.HW;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* 1. Задача по алгоритмам. Найти ряд Фибоначчи для числа 10 */
        Fibonacci fibonacci = new Fibonacci();
        //fibonacci.fi();

        /* 2. Задача по алгоритмам. Реализовать алгоритм бинарного поиска (загугли, разберись что это и реализуй) */
        Binary binary = new Binary();
        int[] mass = {-5, 0, 1, 1, 2, 3, 4, 7, 10, 12, 13, 15};
        int valueToFind = 5;
        System.out.println((binary.binarySearch(mass, valueToFind) < 0) ?
                ("Искомое число " + valueToFind + ", не найдено.") : ("Число " + valueToFind + ", найдено."));

        Binary2 binary2 = new Binary2();
        int[] mass2 = {-5, 0, 1, 1, 2, 3, 4, 7, 10, 12, 13, 15};
        int valueToFind2 = 8;
        System.out.println((binary2.binarySearch2(mass2, valueToFind2) < 0) ?
                ("Искомое число " + valueToFind2 + ", не найдено.") : ("Число " + valueToFind2 + ", найдено."));

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrLength = 10;
        int sumCurrent = 0;
        int sumAll = (arrLength * (arrLength + 1)) / 2;

        for (int j : arr) {
            sumCurrent += j;
        }
        System.out.println((sumAll - sumCurrent != 0) ?
                (sumAll - sumCurrent + " пропущенное число.") : "Все числа на месте");

        System.out.println(Arrays.toString(arr));
        System.out.println(sumAll);
        System.out.println(sumCurrent + " сумма массива без/с числом");
        //System.out.println("Пропущенное число = " + num);

        /* 3. Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
        Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
        а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран. */
        IdenticalWords identicalWords = new IdenticalWords();
    }
}
