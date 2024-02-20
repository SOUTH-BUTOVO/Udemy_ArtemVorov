package ru.Artem_Vorov.level1_Java_basic.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (i == 6) {
                break; // прекращение работы цикла, по достижении i = 6.
            }
            if (i == 2) {
                continue; // пропуск i итерации = 2.
            }
            System.out.println("text_1 " + i);
        }
        System.out.println("END_1");

        int i = 0;
        while (i < 5) {
            System.out.println("text_2 " + i);
            i++;
        }
        System.out.println("END_2");

        int j = 0;
        do {
            System.out.println("text_3 " + j);
            j++;
        } while (j < 5);
        System.out.println("END_3");

        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.println("inner_4 " + l);
            }
            System.out.println("END_4");
        }
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text, (exit - exit):");
        String str = reader.readLine();
        while (!str.equalsIgnoreCase("exit")) {
            System.out.println(str);
            str = reader.readLine();
        }
    }
}
