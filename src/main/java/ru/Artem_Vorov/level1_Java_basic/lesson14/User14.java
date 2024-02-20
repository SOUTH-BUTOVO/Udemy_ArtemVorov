package ru.Artem_Vorov.level1_Java_basic.lesson14;

public class User14 {
    private String name;
    private int age;

    public User14(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
