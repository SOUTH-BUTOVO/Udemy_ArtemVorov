package ru.Artem_Vorov.level3.lesson8.HW;

/* 4 Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
        «May is 5 month». */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MonthNumber {

    Map<String, Integer> month() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
        return map;
    }

    void monthNumber(Map<String, Integer> map) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название месяца:");
        //String input = scanner.nextLine();
        String input2 = reader.readLine();
        if (map.containsKey(input2)) {
            System.out.println("Введённый месяц " + input2 + ", по счёту: " + map.get(input2));
        } else {
            System.out.println("Invalid month name.");
        }
    }
}
