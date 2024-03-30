package ru.Artem_Vorov.level3.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Element1", "Element2", "Element3");
        Collections.sort(list1);
        List<String> list2 = Collections.synchronizedList(list1);
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println(list1);
    }
}
