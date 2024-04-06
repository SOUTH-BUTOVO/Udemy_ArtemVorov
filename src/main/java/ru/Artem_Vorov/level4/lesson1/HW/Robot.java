package ru.Artem_Vorov.level4.lesson1.HW;

public class Robot implements Comparable<Robot> {
    String name;
    int power;
    String model;


    public Robot(String name, int power, String model) {
        this.name = name;
        this.power = power;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Robot o) {
        int nameComparison = this.name.compareTo(o.name);
        int powerComparison = this.power - o.power;

        //return CharSequence.compare(this.name, o.name);
        return nameComparison != 0 ? nameComparison : powerComparison;
    }
}
