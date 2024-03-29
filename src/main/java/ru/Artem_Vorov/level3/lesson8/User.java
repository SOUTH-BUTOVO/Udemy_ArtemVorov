package ru.Artem_Vorov.level3.lesson8;

import java.util.Objects;

public class User {
    private int id;
    private int age;
    private int salary;

    public User() {
    }

    public User(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && salary == user.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary);
    }
}
