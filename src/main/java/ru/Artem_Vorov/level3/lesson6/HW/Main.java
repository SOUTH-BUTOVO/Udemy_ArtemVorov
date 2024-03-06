package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        /* 1. Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
        Потом программа строит новый список. Если в строке чётное число букв, строка удваивается,
        если нечётное – утраивается. Программа выводит содержимое нового списка на экран. Пример ввода:
        Кот
        Коты
        Я
        Пример вывода:
        Кот Кот Кот
        Коты Коты
        Я Я Я */
        ListString listStr = new ListString();
        //listStr.str();

        /* 2. Ввести с клавиатуры 5 чисел и заполнить ими список. Вывести их в обратном порядке.
        Использовать только цикл for. */
        ListNumReverse listNumReverse = new ListNumReverse();
        //listNumReverse.numReverse();

        /* 3. Ввести с клавиатуры 2 числа N и M. Ввести N строк и заполнить ими список. Переставить M первых
        строк в конец списка. Вывести список на экран, каждое значение с новой строки. */
        ListTwoNum twoNum = new ListTwoNum();
        //twoNum.twoNumShift();

        /* 4. Создать массив на 5 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное
        числа в массиве. Вывести на экран максимальное и минимальное числа через пробел. */
        MassNum massNum = new MassNum();
        //massNum.massArr(new int[] {2, 4, 1, 5, 3});

        /* 5. Создать список строк. Ввести строки с клавиатуры и добавить их в список. Вводить с клавиатуры
        строки, пока пользователь не введёт строку "end". "end" не учитывать. Вывести строки на экран,
        каждую с новой строки. */
        ListStrEnd strEnd = new ListStrEnd();
        //strEnd.listStrEnd();

        /* 6. Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.
        Посчитать сколько дней прошло с начала года. Используйте класс LocalDate. */
        DateOfDay dateOfDay = new DateOfDay();
        //dateOfDay.date();

        /* 7. Реверс числа. Ввести число с клавиатуры. Сделать реверс этого числа и вывести результат в консоль
        Пример: входные данные: -5544 результат: -4455 */
        ListNumReverseTwo listNumReverseTwo = new ListNumReverseTwo();
        listNumReverseTwo.numReverse();
    }
}
