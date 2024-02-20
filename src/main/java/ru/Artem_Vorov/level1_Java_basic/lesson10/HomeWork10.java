package ru.Artem_Vorov.level1_Java_basic.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork10 {
    public static void main(String[] args) throws IOException {

        //numUp();
        //numDown();
        //evenNum();
        //keyStr();
        //twoNum();
    /* Вывести на экран квадрат 10х10 из букв P используя цикл while. */
        //square();
    /* Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
    вывести на экран сумму и завершить программу. -1 должно учитываться в сумме. */
        sumNum();
    }

    private static void numUp() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        System.out.println("END_1");
    }

    private static void numDown() {
        int i = 3;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("END_2");
    }

    private static void evenNum() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("END_3");
    }

    private static void keyStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter words:");
        String str = reader.readLine();

        System.out.println("Enter number of repetitions:");
        int num = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i < num) {
            System.out.println(str);
            i++;
        }
    }

    private static void twoNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length X of rectangle:");
        int rectangle_1 = Integer.parseInt(reader.readLine());

        System.out.println("Enter length Y of rectangle:");
        int rectangle_2 = Integer.parseInt(reader.readLine());

        //int i = rectangle_1;
        for (int i = 0; i < rectangle_1; i++) {
            System.out.print(8 + "  ");
            for (int j = 0; j < rectangle_2 -1; j++) {
                System.out.print(8 + "  ");
            }
            System.out.println();
        }
    }

    private static void square() {
        int sideLength = 5;
        int i = 1;

        while (i <= sideLength) {
            System.out.print(new String(new char[sideLength]).replace("\0", "="));
            i++;
        }
    }

    private static void sumNum() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input;
            int result = 0;

            while ((input = reader.readLine()) != null) {
                int n = Integer.parseInt(input);
                result += n;
                if (n == -1) {
                    break;
                }

            }

            System.out.println("Итого: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void sumNum2() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            System.out.println("Введите количество чисел");
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Число " + (i + 1));
                int num = Integer.parseInt(reader.readLine());
                sum += num;
            }

            System.out.println("Сумма введенных чисел" + sum);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Некорректный ввод");
        }
    }
}
