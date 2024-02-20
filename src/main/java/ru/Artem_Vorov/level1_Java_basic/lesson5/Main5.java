package ru.Artem_Vorov.level1_Java_basic.lesson5;

public class Main5 {
    public static void main(String[] args) {
        byte be = 8; // Byte b;
        short st = 16; // Short s;
        int it = 32; // Integer i;
        long lg = 64L; // Long l;

        float ft = 32.32f; // Float f;
        double de = 64.64; // Double d;

        char cr = 'S'; // Character c;

        boolean bn = true; // Boolean b;

        String sg = "Hello  Java!";
        String sg2 = "2";
        System.out.println(2 + sg2);

        int num = Integer.parseInt(sg2);
        System.out.println(num * 22);

        System.out.println("Hello World!" + "\n" + sg);

        System.out.println("text1");
        System.out.print("text2 ");
        System.out.println("text3");
        System.out.print("text4");

        System.out.println("\n" + "----------");

        int res = sum(5, 5);
        System.out.println(res);
        System.out.println(sum(5, 5));
        System.out.println(sum(20, 30));
        int res2 = sum(20, 30);
        System.out.println(res2);

        System.out.println(strConvert("Coffee"));

        printTwoTimes("text: 12345");
    }

    private static int sum(int number1, int number2) {
        //int res = number1 + number2;
        //return res;

        return number1 + number2;
    }

    private static String strConvert(String str) {
        return str + " end.";
    }

    private static void printTwoTimes(String str) {
        System.out.println(str);
        System.out.println(str);
    }
}
