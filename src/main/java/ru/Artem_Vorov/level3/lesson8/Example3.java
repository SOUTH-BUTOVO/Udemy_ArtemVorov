package ru.Artem_Vorov.level3.lesson8;

public class Example3 {
    public static void main(String[] args) {
        User user = new User(30, 3000);
        User user1 = new User(30, 3000);
        User user2 = new User(30, 3000);


        System.out.println(user.equals(user)); // Рефлексивность

        System.out.println(user.equals(user1) && user1.equals(user2) && user.equals(user2)); // Транзитивность

        System.out.println(user.equals(user1) && user1.equals(user)); // Симметричность

        System.out.println(user.equals(null)); // Должно вернуться false
    }
}
