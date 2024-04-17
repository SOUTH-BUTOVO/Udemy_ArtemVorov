package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderNum {
    /* 7 Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
        Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и
        BufferedReader-а) этого метода в try..catch.
        Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести
        на экран все введенные числа в качестве результата. Числа выводить с новой строки сохраняя порядок ввода. */

    void entryNum() {

    }

    void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        System.out.println("Введите цифры, при вводе строки ввод закончится.");

        try {
            //Integer num = Integer.parseInt(reader.readLine());
            int num = 0;
            for (int i = 0; (num = Integer.parseInt(reader.readLine())) != reader.read(); i++) {
                //int num = Integer.parseInt(reader.readLine());
                list.add(num);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e.getMessage());
        }

        System.out.println(list);
        for (int n : list) {
            System.out.println(n);
        }
    }
}
