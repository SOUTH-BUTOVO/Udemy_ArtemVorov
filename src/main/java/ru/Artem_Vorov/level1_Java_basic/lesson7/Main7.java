package ru.Artem_Vorov.level1_Java_basic.lesson7;

public class Main7 {
    public static void main(String[] args) {
        User user = new User();
        user.age = 25; // Обращение к статическим методам и переменным должно быть через Клас а не через объект.
        user.name = "Alex";
        user.pasportDate = "no_pass";
        user.talk("Превед!!!");
        user.pust();
        User.pust(); // Обращение к статическим методам и переменным должно быть через Клас а не через объект.

        User user2 = new User();
        user2.age = 37;
        User.age = 50; // Обращение к статическим методам и переменным должно быть через Клас а не через объект.
        user2.name = "Sergey";
        user2.pasportDate = "45 08";

        System.out.println(user.name + " " + user.age + " " + user.pasportDate);
        System.out.println(user2.name + " " + user2.age + " " + user2.pasportDate);
    }
}
