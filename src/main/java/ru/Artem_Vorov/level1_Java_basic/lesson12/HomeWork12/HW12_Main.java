package ru.Artem_Vorov.level1_Java_basic.lesson12.HomeWork12;

import java.util.Random;

public class HW12_Main {
    public static void main(String[] args) {

        Random random = new Random();

        /* 1: Создать класс Robot с параметрами: name, age, power
        Реализовать метод boolean fight(Robot anotherRobot):
        реализовать механизм драки роботов в зависимости от силы.
        Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this)
        бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false */

        int power1 = random.nextInt(10);
        int power2 = random.nextInt(10);

        System.out.println(power1);
        System.out.println(power2);

        HW12_Robot robot1 = new HW12_Robot("Bender", 1, power1);
        HW12_Robot robot2 = new HW12_Robot("Terminator", 2, power2);

        String name1 = robot1.getName();
        String name2 = robot2.getName();

        System.out.println(fight(power1, power2, name1, name2));
        System.out.println("---------------------------");

/* 1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы владельцем каждого питомца
была одна и та же женщина. */
        womanOwner();
        System.out.println("---------------------------");

/* 1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой. */
        family();
        System.out.println("---------------------------");
    }

    static String fight(int power1, int power2, String name1, String name2) {
        System.out.println("---------------------------");
        System.out.println("Драка двух роботов: " + name1 + " и " + name2);
        System.out.println(name1 + " Ударил " + name2 + " с силой = " + power1);
        System.out.println("Потом ");
        System.out.println(name2 + " Ударил " + name1 + " с силой = " + power2);

        if (power1 > power2) {
            return name1 + " Won the fight!!!";
        } else if (power1 < power2) {
            return name2 + " Won the fight!!!";
        } else {
            return "Draw";
        }
    }

    static void womanOwner() {
        HW12_Woman woman = new HW12_Woman("Василиса", 18);
        System.out.println("Имя владельца: " + woman.getName() + " " + woman.getAge() + " лет.");

        HW12_Cat cat = new HW12_Cat("Bars", 3, woman.getName());
        System.out.println(cat.name + " " + cat.age + " " + cat.owner);

        HW12_Dog dog = new HW12_Dog("Pes", 5, woman.getName());
        System.out.println(dog.name + " " + dog.age + " " + dog.owner);

        HW12_Fish fish = new HW12_Fish("Goldi", 2, woman.getName());
        System.out.println(fish.name + " " + fish.age + " " + fish.owner);
    }

    static void family() {
        HW12_Man man = new HW12_Man("Sergey", 37, "");
        HW12_Woman2 woman = new HW12_Woman2("Elena", 22, "");

        woman.setHusband(man.getName());
        man.setWife(woman.getName());

        System.out.println("Man: " + man.getName() + ", " + man.getAge() + " age," + " wife: " + man.getWife());
        System.out.println("Woman: " + woman.getName() + ", " + woman.getAge() + " age," + " husband: " + woman.getHusband());
    }
}
