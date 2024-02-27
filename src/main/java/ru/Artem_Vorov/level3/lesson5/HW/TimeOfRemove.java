package ru.Artem_Vorov.level3.lesson5.HW;

import java.util.Date;
import java.util.List;

public class TimeOfRemove {
    static List fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }

    static long getTimeMsOfRemove(List list) {
        Date startTime = new Date();
        removeElement(list);
        Date endTime = new Date();
        System.out.println(list.size());
        long finTime = endTime.getTime() - startTime.getTime();
        return finTime;
    }

    static void removeElement(List list) {
        if (list.isEmpty()) return;
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}
