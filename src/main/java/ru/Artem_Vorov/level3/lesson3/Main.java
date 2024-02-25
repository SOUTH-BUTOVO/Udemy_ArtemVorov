package ru.Artem_Vorov.level3.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(); // Integer[] array = new Integer[?];
        list1.add(5);                            // array[0] = 5;
        list1.add(7);                            // array[1] = 7;
        list1.add(1, 9);            // array[2] = 9;
        list1.set(1, 2);                         // array[1] = 2;
        System.out.print(list1.get(0) + " | ");  // System.out.println(array[0]);
        System.out.println(list1.size());        // System.out.println(array.length);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println(list1 + " - Print list 1");
        for (int print : list1) {
            System.out.println(print + " - Print list 2");
        }

        List<Integer> list2 = new LinkedList<>();// Integer[] array = new Integer[?];
        list2.add(5);                            // array[0] = 5;
        list2.add(7);                            // array[1] = 7;
        list2.add(2, 9);            // array[2] = 9;
        list2.set(1, 2);                         // array[1] = 2;
        System.out.print(list2.get(0) + " | ");  // System.out.println(array[0]);
        System.out.println(list2.size());        // System.out.println(array.length);

        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}
