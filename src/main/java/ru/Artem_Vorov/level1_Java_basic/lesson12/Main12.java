package ru.Artem_Vorov.level1_Java_basic.lesson12;

public class Main12 {
    public static void main(String[] args) {

        User12 user = new User12(25, "Alex", "Pass");
        //user.age = 25;
        //user.name = "Alex";

        user.setName("Oleg");
        System.out.println(user.getName());

        user.passportData = "pass";

        user.setName("Sergey");

        user.setAge(11);
        int a = user.getAge();
        System.out.println(a);

        System.out.println(user.passportData);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        //System.out.println(user.setName("Oleg"));


        User12 user1 = new User12(30, "Alex2", "Pass1");
        //user1.age = 30;
        //user1.name = "Alex3";
        user1.passportData = "pass1";

        //System.out.println(user1.name);

        User12 user2 = new User12(30, "Alex2");
        System.out.println(user2.getName());

        User12 user3 = new User12();
        System.out.println(user3.getAge());
    }
}
