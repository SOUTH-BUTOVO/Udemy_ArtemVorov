package ru.Artem_Vorov.level3.lesson8;

public class Example1 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        System.out.println(user1.hashCode() == user2.hashCode());
        System.out.println(user1.equals(user2));

        System.out.println("------");
        User user3 = user2;
        System.out.println(user3.hashCode() == user2.hashCode());
        System.out.println(user3.equals(user2));

        System.out.println("------");
        User user4 = new User(30, 5000);
        User user5 = new User(30, 5000);
        System.out.println(user4.hashCode() == user5.hashCode());
        System.out.println(user4.equals(user5));
    }
}
