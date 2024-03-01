package ru.Artem_Vorov.level3.lesson2;

public class User extends BaseObject {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
