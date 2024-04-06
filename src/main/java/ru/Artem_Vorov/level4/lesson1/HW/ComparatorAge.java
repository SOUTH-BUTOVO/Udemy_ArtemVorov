package ru.Artem_Vorov.level4.lesson1.HW;

import java.util.Comparator;

public class ComparatorAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
