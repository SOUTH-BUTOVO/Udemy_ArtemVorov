package ru.Artem_Vorov.level6_Exceptions.lesson3;

import java.util.Stack;

public class Example3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("text1");
        stack.push("text2");

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("-----");

        System.out.println(stack);
        System.out.println(stack);
        System.out.println("-----");

        for (String str : stack) {
            System.out.println(str);
        }
        System.out.println("-----");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop()); // EmptyStackException, т.к. длинна Stack была = 2.
        System.out.println("-----");

        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
            //System.out.println(element);
        }
    }
}
