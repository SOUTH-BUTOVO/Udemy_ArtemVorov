package ru.Artem_Vorov.level3.lesson5.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public double getWeight() {
//        return weight;
//    }

//    public void setWeight(double weight) {
//        this.weight = weight;
//    }

//    public String getColor() {
//        return color;
//    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    @Override
    public String toString() {
        return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", color = " + color;
    }

//    static void creationCat() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите количество котов:");
//        int numCat = Integer.parseInt(reader.readLine());
//
//        System.out.println("Введите имя класса кота:");
//        //String nameClassCat = reader.readLine();
//        for (int i = 0; i < numCat; i++) {
//
//            Animal nameClassCat = new Animal("1", 1, 1, "1");
//        }
//    }
//
//    static void deposit() {
//        List<Animal> list = new ArrayList<>();
//    }
}
