package ru.Artem_Vorov.level4.lesson1;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

//    @Override
//    public int compare(User o1, User o2) {
//        if (o1.getAge() == o2.getAge()) {
//            return 0;
//        } else if (o1.getAge() < o2.getAge()) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
