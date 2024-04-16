package ru.Artem_Vorov.level5_Java_core.lesson2;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Flyable duck = new Duck();
        duck.fly();

        Flyable obj = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Fly...");
            }
        };
        obj.fly();
    }
}
