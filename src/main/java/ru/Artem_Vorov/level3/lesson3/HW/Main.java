package ru.Artem_Vorov.level3.lesson3.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void listNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        System.out.println("Задайте длину создаваемого листа:");
        int listLength = Integer.parseInt(reader.readLine());

        System.out.println("Введите " + listLength + " чисел, для заполнения листа!");
        for (int i = 0; i < listLength; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println("Размер листа = " + list.size());
        System.out.println(list);
    }

    static void listStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте длину создаваемого листа:");
        int listLength = Integer.parseInt(reader.readLine());

        List<String> list = new ArrayList<>();
        System.out.println("Введите " + listLength + " строк, для заполнения листа!");
        for (int i = 0; i < listLength; i++) {
            list.add(reader.readLine());
        }
        System.out.println("Размер листа = " + list.size());
        System.out.println(list);
        for (String print : list) {
            System.out.println(print);
        }
    }

    static void listNumNullStop() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        Integer numStop = Integer.parseInt(reader.readLine());

        while (numStop != null) {
            try {

                //System.out.println(numStop);
                numStop = Integer.parseInt(reader.readLine());
                list.add(numStop);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter a valid number.");
                System.out.println(list);
                break;
            }
        }
    }

    static void listEvenOdd() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        System.out.println("Задайте длину листа:");
        int listLength = Integer.parseInt(reader.readLine());

        System.out.println("Введите " + listLength + " чисел, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num % 2 == 0) {
                list.add(list.size(), num);
            } else {
                list.add(0, num);
            }
        }
        for (int listSort : list) {
            System.out.print(listSort + "  ");
        }
    }

    static void listNumDel() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        System.out.println("Задайте длину листа:");
        int listLength = Integer.parseInt(reader.readLine());

        System.out.println("Введите " + listLength + " чисел, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(list);
        for (int listForm : list) {
            if (listForm <= 6) {
                System.out.print(listForm + " , ");
            }
        }
    }

    static void listLitDub() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> litLeft = new ArrayList<>();
        List<Integer> litRight = new ArrayList<>();
        System.out.println("Задайте размер листа:");
        int listLength = Integer.parseInt(reader.readLine());

        System.out.println("Введите " + listLength + " чисел, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(list);
        System.out.println("Длинна основного массива составляет: " + list.size());
        System.out.println("Создаём два массива из двух половин основного массива: " + list.size() / 2);
        for (int i = 0; i < list.size() / 2; i++) {
            litLeft = list.subList(0, list.size() / 2);
            litRight = list.subList(list.size() / 2, list.size());
        }
        System.out.print(litLeft);
        System.out.println(litRight);
    }

    static void listStrLengthMax() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        System.out.println("Задайте размер листа:");
        int listLength = Integer.parseInt(reader.readLine());
        System.out.println("Введите " + listLength + " строки, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            list.add(reader.readLine());
        }
        System.out.println(list);
        String strMax = "";
        for (String str : list) {
            if (str.length() > strMax.length()) {
                strMax = str;
            }
//            if (str.length() == strMax.length()) {
//                System.out.println(str + " - Ура!!!");
//            }
        }
        System.out.println("Самая длинная, переданная строчка = " + strMax.length() + " символов.");
        int a = strMax.length();
        for (String strList : list) {
            if (strList.length() == a) {
                System.out.println(strList + " - Ура!!!");
            }
        }
    }

    static void listStrLengthMin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        System.out.println("Задайте длину листа:");
        int listLength = Integer.parseInt(reader.readLine());

        System.out.println("Введите " + listLength + " строки, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            list.add(reader.readLine());
        }
        System.out.println(list);

        System.out.println("Находим минимальную строку в листе.");
        String strMin = list.get(0);
        for (String str : list) {
            if (str.length() <= strMin.length()) {
                strMin = str;
            }
//            if (str.length() == strMin.length()) {
//                System.out.println(str);
//            }
        }
        for (String strList : list) {
            if (strList.length() == strMin.length()) {
                System.out.println(strList);
            }
        }
    }

    static List<Integer> listSort() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listLong = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        List<Integer> list3 = new ArrayList<>();
        int listLength = 6;

        System.out.println("Введите 6 чисел, для заполнения листа.");
        for (int i = 0; i < listLength; i++) {
            listLong.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(listLong + " Основной массив.");

//        for (int i = 0; i < listLong.size(); i++) {
//            if (listLong.get(i) % 3 == 0) {
//                list3.add(listLong.get(i));
//            } if (listLong.get(i) % 2 == 0) {
//                list2.add(listLong.get(i));
//            } else if (listLong.get(i) % 2 != 0 && listLong.get(i) % 3 != 0) {
//                list1.add(listLong.get(i));
//            }
//        }
//        System.out.println(list2 + " Числа делящиеся на 2 без остатка, из основного массива.");
//        System.out.println(list3 + " Числа делящиеся на 3 без остатка, из основного массива.");
//        System.out.println(list1 + " Остальные числа не делящиеся на 2 и 3 без остатка из основного массива.");

        return listLong;
    }

    static void printList(List<Integer> listLong) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int num : listLong) {
            if (num % 3 == 0) {
                list3.add(num);
            }
            if (num % 2 == 0) {
                list2.add(num);
            } if (num % 2 != 0 && num % 3 != 0) {
                list1.add(num);
            }
        }
        System.out.println(list2 + " Числа делящиеся на 2 без остатка, из основного массива.");
        System.out.println(list3 + " Числа делящиеся на 3 без остатка, из основного массива.");
        System.out.println(list1 + " Остальные числа не делящиеся на 2 и 3 без остатка из основного массива.");

        System.out.println(listLong + " fin");
    }

    public static void main(String[] args) throws IOException {
        /* 1. Создать список из чисел и заполнить его на n элементов с консоли.
        Вывести все элементы списка в консоль */
        //listNum();

        /* 2. Создай список строк. Добавь в него n различных строчек с консоли. Выведи его размер на экран.
        Используя цикл выведи его содержимое на экран, каждое значение с новой строки. */
        //listStr();

        /* 3. Создать список из целых чисел и заполнить его с консоли. Ввод целых чисел с клавиатуры
        продолжается, пока не ввели пустую строку в консоли. После того, как ввод завершён - вывести
        все элементы списка в консоль. */
        //listNumNullStop();

        /* 4. Создать список чисел и заполнить его с консоли следующим образом:
        чётные числа добавляют в конец списка, нечётные — в начало. */
        //listEvenOdd();

        /* 5. Создать список чисел и заполнить его с консоли. Удалить все числа больше 6. */
        //listNumDel();

        /* 6. Создать список чисел и заполнить его с консоли. Разбить список на два других:
        - в первый список сохранять чётные числа.
        - во второй список сохранять нечётные числа.
        Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд. */
        //listLitDub();

        /* 7. Создай список строк. Считай с клавиатуры n строк и добавь в список. Используя цикл,
        найди самую длинную строку в списке. Выведи найденную строку на экран.
        Если таких строк несколько, выведи каждую с новой строки. */
        //listStrLengthMax();

        /* 8. Создай список строк. Считай с клавиатуры n строк и добавь в список. Используя цикл,
        найди самую короткую строку в списке. Выведи найденную строку на экран.
        Если таких строк несколько, выведи каждую с новой строки. */
        //listStrLengthMin();

        /* 9. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам:
        Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
        Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
        Используя метод printList выведи эти три списка на экран. Сначала для x%3, потом x%2, потом последний. */
        printList(listSort());
    }
}
