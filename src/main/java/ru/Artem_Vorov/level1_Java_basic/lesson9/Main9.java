package ru.Artem_Vorov.level1_Java_basic.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
    public static void main(String[] args) throws IOException {
        int a = 9;
        if (a > 10) {
            System.out.println("переменная a, больше 10");
        } else if (a < 10) {
            System.out.println("переменная a, меньше 10");
        } else {
            System.out.println("переменная a, равна 10");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age:");
        int age1 = Integer.parseInt(reader.readLine());
        int age2 = Integer.parseInt(reader.readLine());

        if (age1 >= 18) {
            System.out.println("Adult content");
        } else {
            System.out.println("No content");
        }

        if (age1 < age2) {
            System.out.println(age1);
        } else if (age1 > age2) {
            System.out.println(age2);
        } else {
            System.out.println("Equals");
        }
    }
}
