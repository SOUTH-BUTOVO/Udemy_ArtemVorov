package ru.Artem_Vorov.level3.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class L3L2_Generics {

    public static void main(String[] args) {
        List<L3L2_User> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Objects> list4 = new ArrayList<>();
        System.out.println("-----------------");

        L3l2_Example1<L3L2_User> example1 = new L3l2_Example1<>();
        System.out.println(example1.get());
        example1.set(new L3L2_User("Alex", 35));
        System.out.println(example1.get());
        System.out.println("-----------------");
    }
}
