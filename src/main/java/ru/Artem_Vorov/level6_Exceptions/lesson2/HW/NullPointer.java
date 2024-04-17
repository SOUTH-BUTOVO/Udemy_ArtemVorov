package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

public class NullPointer {
    /* 2 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        String s = null;
        String m = s.toLowerCase(); */

    void exception() {
        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException, переданная строка String s = null" + " / " + e.getMessage());
        }
        System.out.println(s);
    }
}
