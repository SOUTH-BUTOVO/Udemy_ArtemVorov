package ru.Artem_Vorov.level1_Java_basic.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // BufferedReader - Используется для буферного чтения из консоли всех символов.
        /* System.in - Вводим данные с клавиатуры в консоль и введёные данные будут прочитаны из консоли,
        InputStreamReader - переводим данные байты в символы и складываем их в буффер BufferedReader */

        String s = reader.readLine();
        // readLine() - Метод складывает в буфер всё что находится в одной строке консоли и записывает в переменную.
        System.out.println(s);

//        InputStreamReader streamReader = new InputStreamReader(System.in);
        /* System.in - Используется для ввода данных в консоль при помощи клавиатуры.
        InputStreamReader - Используется для чтения этих данных и переводить в символы. */
//        System.out.println(streamReader.read());


//        while (true) {
//            int data = System.in.read();
//            System.out.println((char)data);
//        }

        String str = reader.readLine();
        // Создаём переменную String и записываем содержимое метода readLine();
        float num = Integer.parseInt(str);
        // Далее преобразовываем String в число, при помощи Класса обёртки Integer.
        System.out.println(num * 2);

        // Делаем то же самое что чуть выше только в одну строчку:
        float num2 = Integer.parseInt(reader.readLine());
        System.out.println(num2 * 10);

        System.out.println(sum(num, num2));
    }

    private static float sum(float number1, float number2) {
        float res = number1 + number2;
        return res;
    }
}
