package ru.Artem_Vorov.level6_Exceptions.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) throws IOException {
        System.out.println(readInt().equals(0) ? "Кроме цифр введены другие символы" : readInt());
    }

    static Integer readInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = null;
        System.out.println("Введите строку:");
        try {
            return Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            //System.exit(404);
            return 0;
        } finally {
            System.out.println("catch1");
            //n.toString();
            System.out.println("catch2");
        }
    }
}
