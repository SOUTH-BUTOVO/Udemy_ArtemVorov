package ru.Artem_Vorov.level4.lesson1.HW;

/* 3. Создать класс User с 3 полями - age(int), name(String), salary(int). Создать коллекцию
        HashMap<User, String> и добавить туда 5 записей по принципу юзер-должность. Данные добавлять с консоли,
        используя BufferedReader. Разделить коллекцию HashMap на 3 коллекции TreeSet:
            - в первую коллекцию сохранять пользователей с должностью - boss.
            - во вторую коллекцию сохранять пользователей с должностью - worker.
            - в третью коллекцию сохранять пользователей с другими должностями.
        Отсортировать пользователей с должностью boss, по параметру salary и вывести содержимое коллекции в консоль.
        Отсортировать пользователей с должностью worker, по параметру age и вывести содержимое коллекции в консоль.
        Отсортировать пользователей с другими должностями, по параметру name и вывести содержимое коллекции в консоль. */

public class User {
    String name;
    int age, salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", age=" + age+ ", salary=" + salary;
    }
}
