package ru.Artem_Vorov.level1_Java_basic.lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        sum();
        multi();
        subt();
        div();
        System.out.println("Количество долларов в обмен на евро составляет: " + convert(101));
        System.out.println("Переданное число и увеличенное на 10% = " + percent(11));
        print("Hello Java!");
    }

    private static void sum() {
        int a = 40, b = 60;
        int x = a + b;
        System.out.println(x);
    }

    private static void multi() {
        int a = 10, b = 20;
        System.out.println(a * b);
    }

    private static void subt() {
        int a = 400;
        int b = 100;
        System.out.println(a - b);
    }

    private static void div() {
        int a = 800;
        int b = 2;
        System.out.println(a / b);
    }

    private static float convert(float euro) {
        return euro * 1.25f;
    }

    private static float percent(float num) {
        //float res = num / 100 * 10 + num;
        return num + (num / 100 * 10);
    }

    private static void print(String str) {
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);

        for (int i = 0; i < 4; i++) {
            System.out.println(str);
        }
    }
}
