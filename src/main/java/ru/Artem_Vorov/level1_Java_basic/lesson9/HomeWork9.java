package ru.Artem_Vorov.level1_Java_basic.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork9 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers:");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.print("Max num = ");
        System.out.println(Integer.max(num1, num2));

        System.out.println("---------------");
        System.out.println("Enter third number:");
        int num3 = Integer.parseInt(reader.readLine());
        //System.out.print("Min num = ");
        if (num1 < num2 && num1 < num3) {
            System.out.println("Min num = " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Min num = " + num2);
        } else {
            System.out.println("Min num = " + num3);
        }

        System.out.println("---------------");
        System.out.print("Average of three numbers = ");
        System.out.println((num1 + num2 + num3) / 3);

        compare(5);
        System.out.println("---------------");

        int num4 = Integer.parseInt(reader.readLine());
        System.out.println(keyNum(num4));
        System.out.println("---------------");

        int num5 = Integer.parseInt(reader.readLine());
        checkInterval(num5);
        System.out.println("---------------");

        int num6 = Integer.parseInt(reader.readLine());
        int num7 = Integer.parseInt(reader.readLine());
        closeToFive(num6, num7);
    }

    private static void compare(int a) {
        System.out.println("---------------");
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }

    private static int keyNum(int a) {
        System.out.println("---------------");
        System.out.println("Enter number:");
        if (a >= 0) {
            return a *= 2;
        } else {
            return a *= 10;
        }
    }

    private static void checkInterval(int a) {
        System.out.println("---------------");
        if (a >= 20 && a <= 50) {
            System.out.println("Variable is in the interval");
        } else {
            System.out.println("Variable is not contained in the interval");
        }
        System.out.println("---------------");
    }

    private static void closeToFive(int a, int b) {
        if (5 - a <= 5 - b || 5 + a >= 5 + b) {
            System.out.println("Variable a is greater");
        } else {
            System.out.println("Variable b is greater");
        }
    }
}
