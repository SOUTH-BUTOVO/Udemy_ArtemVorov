package ru.Artem_Vorov.level3.lesson5.HW;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        /* 1. Посчитать время работы метода set в LinkedList и ArrayList
        Посчитать время работы метода remove в LinkedList и ArrayList */
//            System.out.println(TimeOfSet.getTimeMsOfSet(TimeOfSet.fill(new ArrayList())));
//            System.err.println(TimeOfSet.getTimeMsOfSet(TimeOfSet.fill(new LinkedList())));
//            Thread.sleep(500);
//            System.out.println("----------");
//            System.out.println(TimeOfRemove.getTimeMsOfRemove(TimeOfRemove.fill(new ArrayList())));
//            System.err.println(TimeOfRemove.getTimeMsOfRemove(TimeOfRemove.fill(new LinkedList())));
//            Thread.sleep(500);
//            System.out.println("----------");

        /* 2. Создай список строк. Добавь в него 5 строчек с клавиатуры. Удали последнюю строку и
        вставь её в начало. Повторить 5 раз. Используя цикл выведи содержимое на экран,
        каждое значение с новой строки.
        Удали 3ий элемент списка, и выведи оставшиеся элементы в обратном порядке. */
        //ListRemove.listStr();
        System.out.println("\n" + "----------");

        /* 4. Создай список слов, заполни его самостоятельно. Метод fix должен:
            - удалять из списка строк все слова, содержащие букву «р»
            - удваивать все слова содержащие букву «л»
            - если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
        С другими словами ничего не делать.
        Пример:
        лира
        лоза
        роза
        Выходные данные:
        лира
        лоза
        лоза */
        ListRemoveDouble.fix(List.of("лира", "лоза", "роза", "стол", "кровать", "люстра"));
        //ListRemoveDouble.fix();
        System.out.println("\n" + "----------");


        /* 5. Введи с клавиатуры 5 слов в список строк. Метод doubleValues должен удваивать слова по принципу:
        a,b,c -> a,a,b,b,c,c.
        Используя цикл for выведи результат на экран, каждое значение с новой строки.
        Пример:
        краб
        лось
        рак
        Выходные данные:
        краб краб
        лось лось
        рак рак */

        /* 6. Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.
        Создать класс Cat с параметрами name, age, weight, tail;
        Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
        "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        Вводить параметры с клавиатуры и создавать объект с введенными параметрами. Ввод продолжается,
        пока переменная с именем не пуста.
        Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
        Пример:
        Cat name is Barsik, age is 6, weight is 5, tail = 22
        Cat name is Murka, age is 8, weight is 7, tail = 20 */
    }
}
