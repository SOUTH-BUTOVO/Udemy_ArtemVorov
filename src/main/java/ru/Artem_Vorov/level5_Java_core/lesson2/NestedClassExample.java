package ru.Artem_Vorov.level5_Java_core.lesson2;

public class NestedClassExample {
    private int exampleNonStatic;
    private static int exampleStatic;

    public static void main(String[] args) {

    }

    // Статический вложенный класс.
    static class NestedClassStatic {
        void m(){
            //System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }

    class NestedClassNoStatic {
        void m(){
            System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }
}
