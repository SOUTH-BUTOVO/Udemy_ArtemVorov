package ru.Artem_Vorov.level1_Java_basic.lesson12;

public class User12 {
    private int age;
    private String name;
    String passportData;

    User12(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }

    User12(int age, String name) {
        this.age = age;
        this.name = name;
    }

    User12() {
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
