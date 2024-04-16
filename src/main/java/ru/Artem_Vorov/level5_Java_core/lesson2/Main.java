package ru.Artem_Vorov.level5_Java_core.lesson2;

public class Main {
    public static void main(String[] args) {
        NestedClassExample.NestedClassStatic nestedClass = new NestedClassExample.NestedClassStatic();
        nestedClass.m();

        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.InnerClass correctInnerClass = innerClassExample.new InnerClass();
        correctInnerClass.m();
    }
}
