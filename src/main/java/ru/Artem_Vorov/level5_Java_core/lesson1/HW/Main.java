package ru.Artem_Vorov.level5_Java_core.lesson1.HW;


public class Main {

    public static void main(String[] args) {
        /* 1. Задача по алгоритмам. Найти ряд Фибоначчи для числа 10 */
        Fibonacci fibonacci = new Fibonacci();
        //fibonacci.fi();

        /* 2. Задача по алгоритмам. Реализовать алгоритм бинарного поиска (загугли, разберись что это и реализуй) */
        Binary binary = new Binary();
        binary.binarySearch();

        /* 3. Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
        Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
        а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран. */
        IdenticalWords identicalWords = new IdenticalWords();
    }
}
