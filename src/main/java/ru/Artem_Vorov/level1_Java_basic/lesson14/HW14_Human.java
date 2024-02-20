package ru.Artem_Vorov.level1_Java_basic.lesson14;

public class HW14_Human {
    String name;
    String floor;
    int age;
    String father;
    String mother;

    public HW14_Human(String name, String floor, int age, String father, String mother) {
        this.name = name;
        this.floor = floor;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return ("Имя: " + name + ", пол: " + floor + ", age: " + age + ", отец: " + father + ", мать: " + mother);
    }
}
