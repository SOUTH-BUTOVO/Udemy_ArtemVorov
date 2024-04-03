package ru.Artem_Vorov.level4.lesson1;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private int salary;

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

//    @Override
//    public int compareTo(User o) {
//        return 0;
//    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }

//    @Override
//    public int compareTo(User o) {
//        if (this.age == o.age) {
//            return 0;
//        } else if (this.age < o.age) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
