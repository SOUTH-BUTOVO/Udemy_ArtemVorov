package ru.Artem_Vorov.level5_Java_core.lesson3;

public class Example1 {
    public static void main(String[] args) {
        resolve(Weather.RAINY);
        resolve(Weather.SNOWY);
        resolve(Weather.SUNNY);

        resolveWithSwitch(Weather.RAINY);
        resolveWithSwitch(Weather.SUNNY);

        resolve(Role.ADMIN);
    }

    private static void resolve(Weather weather) {
        if (weather == Weather.RAINY) {
            System.out.println("Rainy");
        } else if (weather == Weather.SNOWY) {
            System.out.println("Snowy");
        }
    }

    private static void resolveWithSwitch(Weather weather) {
        switch (weather) {
            case RAINY:
                System.out.println("Rainy");
                break;
            case SUNNY:
                System.out.println("Sunny");
                break;
        }
    }

    private static void resolve(Role role) {
        if (role == Role.ADMIN) {
            System.out.println(role.getValue());
        }
    }
}
