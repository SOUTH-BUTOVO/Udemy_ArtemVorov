package ru.Artem_Vorov.level4.lesson1;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }

//    @Override
//    public int compare(User o1, User o2) {
//        if (o1.getSalary() == o2.getSalary()) {
//            return 0;
//        } else if (o1.getSalary() < o2.getSalary()) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
