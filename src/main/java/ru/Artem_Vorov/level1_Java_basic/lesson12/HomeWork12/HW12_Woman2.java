package ru.Artem_Vorov.level1_Java_basic.lesson12.HomeWork12;

public class HW12_Woman2 {
    private String name;
    private int age;
    private String husband;

    public HW12_Woman2(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }
}
