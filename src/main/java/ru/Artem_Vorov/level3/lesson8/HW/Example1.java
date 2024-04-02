package ru.Artem_Vorov.level3.lesson8.HW;

/* 1 Создать словарь (Map<String, String>) занести в него 5 записей по принципу «Фамилия» - «Имя».
        Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
        - создать метод getCountTheSameFirstName(Map<String, String> map, String name), который должен
        вернуть количество пар с именем, которое приходит в аргумент name.
        - создать метод getCountTheSameLastName(Map<String, String> map, String lastName), который должен
        вернуть количество пар с фамилией, которая приходит в аргумент lastName. */

import java.util.Map;

public class Example1 {

    String searchFamily = "Самойлович";
    String searchName = "Сергей";
    Map<String, String> map = Map.of(
        "Самойлович", "Сергей",
        "Куликов", "Александр",
        "Волков", "Евгений",
        "Жерноклеев", "Андрей",
        "Ширшов", "Сергей");

    void dictionary() {
        Dictionary dictionary = new Dictionary();
        dictionary.getCountTheSameFirstName(map, searchFamily);
        dictionary.getCountTheSameLastName(map, searchName);
    }
}
