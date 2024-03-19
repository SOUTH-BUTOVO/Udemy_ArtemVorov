package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 1. Ввести с клавиатуры число N. Считать N целых чисел и заполнить ими список - метод getIntegerList.
        Найти минимальное число среди элементов списка - метод getMinimum. */
        ListNum listNum = new ListNum();
        //listNum.getMinimum(listNum.getIntegerList());

        /* 2. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
        Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
        Вывести все объекты Human на экран.
        Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
        Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
        Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha */
        Human human = new Human("0", true, 1);
        human.setName("Sergey");
        //System.out.println(human);
        //System.out.println("---");

        //ArrayList

        Ded<Human> ded = new Ded<>();
        ded.setInstance(new Human("Nikolay", true, 1));

        Baba<Human> baba = new Baba<>();
        baba.setInstance(new Human("Maria", false, 2));

        Papa<Human> papa = new Papa<>();
        papa.setInstance(new Human("Eduard", true, 3));

        Mama<Human> mama = new Mama<>();
        mama.setInstance(new Human("Vera", false, 4));

        Children<Human> children1 = new Children<>();
        children1.setInstance(new Human("Andrey", true, 5));

        Children<Human> children2 = new Children<>();
        children2.setInstance(new Human("Sergey", true, 6));

        Human human1 = new Human();
        human1.setName(" Vanya");
        System.out.println(human1.getName());

        ded.setInstance(new Human("Nikolay", true, 1, human1.getName()));

        System.out.println(ded.getInstance());
        System.out.println("---");
        System.out.println(baba.getInstance());
        System.out.println("---");
        System.out.println(papa.getInstance());
        System.out.println("---");
        System.out.println(mama.getInstance());
        System.out.println("---");
        System.out.println(children2.getInstance());
        System.out.println("---");
        System.out.println(children1.getInstance());
        System.out.println("-------------------" + "\n");


        /* 3. Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел. */
        MassTen massTen = new MassTen();
        massTen.mass();

        /* 4. Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке. */

        /* 5. Создать коллекцию HashMap<String, String>, занести туда 4 пары строк. Вывести содержимое коллекции
        на экран, каждый элемент с новой строки. Пример вывода:
        ключ - значение
        ключ - значение
        ключ - значение
        ключ - значение */

        /* 6. Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода
        printKeys: Вывести на экран список ключей, каждый элемент с новой строки. */

        /* 7. Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода
        printValues: Вывести на экран список значений, каждый элемент с новой строки. */

        /* Удалить все числа больше 10 Создать множество чисел (Set<Integer>), занести туда 5 различных чисел.
        При помощи метода removeAllNumbersMoreThan10 удалить из множества все числа больше 10. */
    }
}
