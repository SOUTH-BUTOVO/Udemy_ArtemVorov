package ru.Artem_Vorov.level3.lesson5.HW;

import java.util.Date;
import java.util.List;

public class TimeOfSet {

    static List fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }

    static long getTimeMsOfSet(List list) {
        Date startTime = new Date();
        setElement(list);
        Date endTime = new Date();
        long finTime = endTime.getTime() - startTime.getTime();
        System.out.println(list.size());
        return finTime;
    }

    static void setElement(List list) {
        for (int i = 0; i < 100000; i++) {
            if (list.isEmpty()) return;
            list.set(0, new Object());
        }
    }
}
