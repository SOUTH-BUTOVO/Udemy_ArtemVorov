package ru.Artem_Vorov.level1_Java_basic.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите желаемый размер оплаты друда в $/час:");
        int num = Integer.parseInt(reader.readLine());

        System.out.println("Я буду зарабатывать " + num + "$ в час!");
        System.out.println("-------------------------");


        System.out.println("Введите имя:");
        String str1 = reader.readLine();
        System.out.println("Введите желаемый размер оплаты друда в $:");
        String str2 = reader.readLine();
        System.out.println("Введите дату, когда Вы хотите получать такую зарплату:");
        String str3 = reader.readLine();

        System.out.println(str1 + ", будет получать: " + str2 + "$ в - " + str3 + "году!!!");


        System.out.println("\n" + Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);

        System.out.println(Integer.parseInt("F", 16));
        System.out.println(Integer.valueOf("20", 8));

        System.out.println(Integer.toString(17));
        System.out.println(Integer.toString(5, 2));

        int x = 4;
        int y = 400;

        System.out.println(Integer.max(x, y));
        System.out.println(Integer.min(x, y));
        System.out.println(Integer.sum(x, y));

        // https://javarush.com/groups/posts/2743-rukovodstvo-po-klassu-java-integer

        System.out.println("----------------");
        System.out.println(Integer.valueOf("1100001001", 2));
        System.out.println(Integer.valueOf("33332", 5));
    }
}
