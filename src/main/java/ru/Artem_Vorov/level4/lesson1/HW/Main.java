package ru.Artem_Vorov.level4.lesson1.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /* 1. Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
        Вывести результат на экран. Используй метод класса String - toCharArray(); Пример ввода:
            String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            String text2 = "абв";
            String text3 = "ддд";
            String text4 = "яяа";
            String text5 = "вввв";
            Пример вывода:
            а 3
            б 2
            в 6
            г 1
            д 4
            …
            я 3 */
        StringNumLetter stringNumLetter = new StringNumLetter();
        //stringNumLetter.numLetter(stringNumLetter.stringMass());

        /* 2. Создать класс Robot с двумя полями - power(int), model(String). Создать коллекцию TreeMap и
        добавить туда 3 роботов. Реализовать интерфейс Comparable в классе Robot:
            - метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые, то
        сравнение должно проходить по полю power. Вывести в консоль содержимое коллекции TreeMap. */
        Robot robot1 = new Robot("Борис", 100, "Boxing");
        Robot robot2 = new Robot("Артём", 90, "Fighter");
        Robot robot3 = new Robot("Василий", 80, "Karate");

        Map<Robot, String> map = new TreeMap<>();
        map.put(robot1, "Робот 2");
        map.put(robot2, "Робот 1");
        map.put(robot3, "Робот 3");

        for (Map.Entry<Robot, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("------------------");

        /* 3. Создать класс User с 3 полями - age(int), name(String), salary(int). Создать коллекцию
        HashMap<User, String> и добавить туда 5 записей по принципу юзер-должность. Данные добавлять с консоли,
        используя BufferedReader. Разделить коллекцию HashMap на 3 коллекции TreeSet:
            - в первую коллекцию сохранять пользователей с должностью - boss.
            - во вторую коллекцию сохранять пользователей с должностью - worker.
            - в третью коллекцию сохранять пользователей с другими должностями.
        Отсортировать пользователей с должностью boss, по параметру salary и вывести содержимое коллекции в консоль.
        Отсортировать пользователей с должностью worker, по параметру age и вывести содержимое коллекции в консоль.
        Отсортировать пользователей с другими должностями, по параметру name и вывести содержимое коллекции в консоль. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<User, String> mapUser = new HashMap<>();
        System.out.println("Заполните данные 5 сотрудников:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите должность сотрудника:");
            String post = reader.readLine();
            System.out.println("Введите имя сотрудника:");
            String name = reader.readLine();
            System.out.println("Введите возраст сотрудника:");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Введите зарплату сотрудника:");
            int salary = Integer.parseInt(reader.readLine());
            User user = new User(name, age, salary);
            mapUser.put(user, post);
        }

        Comparator<User> comparatorSalary = new ComparatorSalary();
        Set<User> set1 = new HashSet<>();
        for (Map.Entry<User, String> entry : mapUser.entrySet()) {
            for (int i = 0; i < mapUser.size(); i++) {
                if (entry.getValue().equalsIgnoreCase("boss")) {
                    set1.add(entry.getKey());
                }
            }
        }

        Comparator<User> comparatorAge = new ComparatorAge();
        Set<User> set2 = new HashSet<>();
        for (Map.Entry<User, String> entry : mapUser.entrySet()) {
            for (int i = 0; i < mapUser.size(); i++) {
                if (entry.getValue().equalsIgnoreCase("worker")) {
                    set2.add(entry.getKey());
                }
            }
        }

        Set<User> set3 = new HashSet<>();
        for (Map.Entry<User, String> entry : mapUser.entrySet()) {
            for (int i = 0; i < mapUser.size(); i++) {
                if (!(entry.getValue().equalsIgnoreCase("boss")) &&
                        !(entry.getValue().equalsIgnoreCase("worker"))) {
                    set3.add(entry.getKey());
                }
            }
        }

        for (Map.Entry<User, String> entry : mapUser.entrySet()) {
            User key = entry.getKey();
            //System.out.println(entry.getValue() + " " + key);
            //System.out.println(entry);
        }
        //mapUser.forEach((key, value) -> System.out.println(key.toString() + " -> " + value));
        System.out.println(set1 + "BOSS set1");
        System.out.println(set2 + "Worker set2");
        System.out.println(set3 + "Other set3");
    }
}