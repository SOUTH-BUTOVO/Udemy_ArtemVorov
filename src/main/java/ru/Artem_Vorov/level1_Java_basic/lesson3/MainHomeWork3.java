package ru.VorovArtem.level_1_Java_basic.lesson3;

public class MainHomeWork3 {
    public static void main(String[] args) {
        byte be = 8;
        short st = 16;
        int it = 32;
        long lg = 64L;

        float ft = 32.32f;
        double de = 64.64;

        char cr = 'S';

        boolean bn = true;

        String sg = "Hello Java";

        System.out.println("\n " + be + "\n " + st + "\n " + it + "\n " + lg + "\n "
                        + ft + "\n " + de + "\n " + cr + "\n " + bn + "\n " + sg);

        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int temp = number1;


        number1 = number2;
        System.out.println(number1);
        number2 = number3;
        System.out.println(number2);
        number3 = temp;
        System.out.println(number3);

        // Не понял, как по заданию сделать нум3, со значением 10.
        /*
        1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
        2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
        3) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
        4) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
        5) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
        */

        // РЕШЕНИЕ ОТ ПРЕПОДАВАТЕЛЯ, СОЗДАТЬ ДОПОЛНИТЕЛЬНУЮ ПЕРЕМЕННУЮ!!!)))

        //System.out.println("\n" + number1 + "\n" + number2 + "\n" + number3);
    }
}
