package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DelSetNumTen {
    /* Удалить все числа больше 10 Создать, множество чисел (Set<Integer>), занести туда 5 различных чисел.
        При помощи метода removeAllNumbersMoreThan10 удалить из множества все числа больше 10. */
    Set<Integer> setNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        System.out.println("ВВедите 5 чисел, для заполнения Set коллекции.");
        System.out.println("Числа больше 10, будут удалены!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число:");
            Integer num = Integer.parseInt(reader.readLine());
            set.add(num);
        }
        System.out.println(set + " - Origin");
        return set;
    }

    void removeAllNumbersMoreThan10(Set<Integer> set) {

        set.removeIf(i -> i > 10);
        System.out.println(set + " - Remove");

        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
            Integer i =  iterator.next();
            if (i > 10) {
            iterator.remove();
            }
        }
        System.out.println(set + " - Remove");
    }
}
