package ru.Artem_Vorov.level5_Java_core.lesson2;

public class InnerClassExample {
    private int exampleNonStatic;
    private static int exampleStatic;

    public static void main(String[] args) {

    }

    class InnerClass{
        void m() {
            System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }

    static class InnerStaticClass{
        void m() {
            //System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }
}
