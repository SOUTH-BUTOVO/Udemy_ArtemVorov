package ru.Artem_Vorov.level4.lesson1.HW;

import java.util.Comparator;
public class ComparatorSalary implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getSalary() == o2.getSalary()) {
            return 0;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else {
            return 1;
        }
    }
}
