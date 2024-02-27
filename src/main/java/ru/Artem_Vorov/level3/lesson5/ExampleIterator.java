package ru.Artem_Vorov.level3.lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("-----");

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-----");

        for (String s : list) {

        }

        List<String> list2 = List.of("John", "Sara", "Tony");
        for (Iterator i = list2.iterator(); i.hasNext();) {
            String name = (String) i.next();
            System.out.println("Name = " + name);
        }
        System.out.println("-----");

        for (Iterator<String> i = list2.iterator(); i.hasNext();) {
            String name = (String) i.next();
            System.out.println("Name = " + name);
        }
        System.out.println("-----");

        for (String name : list2) {
            System.out.println("Name = " + name);
        }
        System.out.println("-----");
    }
}
