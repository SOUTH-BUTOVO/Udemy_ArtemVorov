package ru.Artem_Vorov.level3.lesson7.HW;

import java.io.IOException;

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
        Human human = new Human();
        human.list.add(1, human);

        /* 3. Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел. */

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
