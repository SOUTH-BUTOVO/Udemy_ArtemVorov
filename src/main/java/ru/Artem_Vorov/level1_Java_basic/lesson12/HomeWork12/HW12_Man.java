package ru.Artem_Vorov.level1_Java_basic.lesson12.HomeWork12;

public class HW12_Man {
    private String name;
    private int age;
    private String wife;

    public HW12_Man(String name, int age, String wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
