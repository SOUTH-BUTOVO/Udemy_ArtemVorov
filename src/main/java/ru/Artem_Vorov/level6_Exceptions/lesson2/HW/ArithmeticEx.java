package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

public class ArithmeticEx {
    /* 1 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int a = 42 / 0; */

    void exception() {
        int a = 42;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException, делить на 0 нельзя." + e.getMessage());
        }
    }
}
