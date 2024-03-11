package ru.Artem_Vorov.level3.lesson7.HW;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private System name;
    private boolean gender;
    private int age;

    public Human() {
    }

    public Human(System name, boolean gender, int age, List<Human> list) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.list = list;
    }

    public System getName() {
        return name;
    }

    public void setName(System name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    List<Human> list = new ArrayList<Human>();

    ArrayList<Human> children;
}
