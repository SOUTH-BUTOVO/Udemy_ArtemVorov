package ru.Artem_Vorov.level3.lesson7.HW;

import java.util.ArrayList;

public class Human {
    private String name;
    private boolean gender;
    private int age;
//    private ArrayList<Human> human;

    public Human() {
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
//        human = new ArrayList<Human>();
    }

    public Human(String name, boolean gender, int age, String child) {
        this.name = name;
        this.gender = gender;
        this.age = age;
//        human = new ArrayList<Human>();
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean isGender() {
//        return gender;
//    }

//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public ArrayList<Human> getHuman() {
//        return human;
//    }

//    public void setHuman(Human human) {
        //this.human = human;
//    }

    @Override
    public String toString() {
        String gender;
        if (this.gender) {
            gender = "Мужской";
        } else gender = "Женский";
        return ("Моё имя " + name + ", пол " + gender + ", возраст " + age);
    }
}
