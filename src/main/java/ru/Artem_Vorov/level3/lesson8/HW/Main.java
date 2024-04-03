package ru.Artem_Vorov.level3.lesson8.HW;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 1 Создать словарь (Map<String, String>) занести в него 5 записей по принципу «Фамилия» - «Имя».
        Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
        - создать метод getCountTheSameFirstName(Map<String, String> map, String name), который должен
        вернуть количество пар с именем, которое приходит в аргумент name.
        - создать метод getCountTheSameLastName(Map<String, String> map, String lastName), который должен
        вернуть количество пар с фамилией, которая приходит в аргумент lastName. */
        Dictionary dictionary = new Dictionary();
        //dictionary.dictionaryFamily();

        /* 2 Удалить всех людей, родившихся летом. Создать словарь (Map<String, Date>) и занести в него 5
        записей по принципу:
        «фамилия» - «дата рождения».
        Удалить из словаря всех людей, родившихся летом.
        map.put("Jhon", new Date("JUNE 1 1980"));
        map.put("Mark", new Date("JUNE 5 1999"));
        map.put("Elone", new Date("DECEMBER 13 1996"));
        map.put("Stieve", new Date("JUNE 1 1980"));
        map.put("Clark", new Date("MARCH 1 1980")); */
        DictionaryRemove dR = new DictionaryRemove();
        //dR.humanRemove(dR.dictionary());


        /* 3 Удалить людей, имеющих одинаковые имена.
        Создать словарь (Map<String, String>) занести в него десять записей по принципу:
        «фамилия» - «имя».
        Удалить людей, имеющих одинаковые имена.
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario"); */
        DictionaryRemoveName removeName = new DictionaryRemoveName();
        removeName.removeName(removeName.dictionary());

        /* 4 Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
        «May is 5 month».
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12); */
        MonthNumber mN = new MonthNumber();
        //mN.monthNumber(mN.month());
    }
}
