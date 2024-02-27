package ru.Artem_Vorov.level3.lesson5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfInsert {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(fill(new ArrayList())));
        System.err.println(getTimeMsOfInsert(fill(new LinkedList())));
    }

    private static List fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }

    static long getTimeMsOfInsert(List list) {
        Date startTime = new Date();
        insertElement(list);
        Date endTime = new Date();
        System.out.println(list.size());
        return endTime.getTime() - startTime.getTime();
    }

    static void insertElement(List list) {
        for (int i = 0; i < 100000; i++) {
            if (list.isEmpty()) return;
            list.add(0, new Object());
        }
    }
}
