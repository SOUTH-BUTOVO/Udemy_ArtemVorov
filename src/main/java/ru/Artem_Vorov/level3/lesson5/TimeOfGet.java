package ru.Artem_Vorov.level3.lesson5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.err.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list) {
        for (int i = 0; i < 50000; i++) {
            list.add(new Object());
        }
        return list;
    }

    static long getTimeMsOfGet(List list) {
        Date startTime = new Date();
        getElement(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }

    static void getElement(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;
        for (int i = 0; i < list.size(); i++) {
            list.get(x);
        }
    }
}
