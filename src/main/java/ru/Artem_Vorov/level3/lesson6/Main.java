package ru.Artem_Vorov.level3.lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text3");
        set.add("text1");
        set.add("text");
        set.add("text2");
        set.add("text2");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------");

        Set<String> set2 = new TreeSet<>();
        set2.add("text3");
        set2.add("text1");
        set2.add("text");
        set2.add("text2");
        set2.add("text2");
        System.out.println(set2);
        System.out.println("---------");

        Set<String> set3 = new LinkedHashSet<>();
        set3.add("text3");
        set3.add("text1");
        set3.add("text");
        set3.add("text2");
        set3.add("text2");
        System.out.println(set3);
        for (String u : set3) {
            System.out.println(u);
        }
        System.out.println("---------");
    }
}
