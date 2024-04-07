package ru.Artem_Vorov.level4.lesson1.HW;

import java.util.Comparator;

public class ComparatorName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return CharSequence.compare(o1.getName(), o2.getName());
    }
}
