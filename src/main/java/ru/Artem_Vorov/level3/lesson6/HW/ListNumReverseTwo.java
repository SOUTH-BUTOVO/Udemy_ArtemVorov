package ru.Artem_Vorov.level3.lesson6.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNumReverseTwo {
    void numReverse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        Integer num = Integer.parseInt(reader.readLine());

        /* // Вариант № 1:
        // Разбивка числа на цифры
        while (num != 0) {
            list.add(0, num%10);
            num = num / 10;
        }
        System.out.println(list);

        // Реверс порядка цифр
        Collections.reverse(list);
        num = 0;

        // Сбор цифр обратно в число
        for (int nums : list) {
            num = num * 10 + nums;
        }
        System.out.println(num); */

        /* // Вариант № 2:
        // Разбиваем число на цифры
        while (num != 0) {
            list.add(0, num % 10); num /= 10; }
        // Реверсируем порядок цифр
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i); list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp); }
        num = 0;
        // Собираем цифры обратно в число
        for (int digit : list) {
            num = num * 10 + digit; }
        System.out.println("Реверсированное число: " + num); */

        // Вариант № 3 для двухзначных чисел:
        //System.out.println((num / 10) + (num % 10) * 10);

        // Вариант № 4:
        if (num < 10 && num > -10) {
            System.out.println("Число " + num + " одноразрядное, его нет смысла переворачивать.");
        } else {
            System.out.println("Введите число, меньше 0 или больше 10. И оно будет перевёрнуто:");
            int rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            System.out.println(rev);
        }
    }
}
