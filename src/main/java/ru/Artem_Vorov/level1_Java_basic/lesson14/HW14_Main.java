package ru.Artem_Vorov.level1_Java_basic.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW14_Main {

    static void human() {
        HW14_Human ded1 = new HW14_Human("Leonid", "Мужской", 65, "Enisey", "Mary");
        HW14_Human ded2 = new HW14_Human("Nikolay", "Мужской", 61, "Volga", "Ekaterina");
        HW14_Human baba1 = new HW14_Human("Olga", "Женский", 58, "Erimey", "Anastasia");
        HW14_Human baba2 = new HW14_Human("Elena", "Женский", 59, "Igor", "Tatiana");
        HW14_Human father = new HW14_Human("Sergey", "Мужской", 37, ded1.name, baba1.name);
        HW14_Human mother = new HW14_Human("Svetlana", "Женский", 35, ded2.name, baba2.name);
        HW14_Human son = new HW14_Human("Andrey", "Мужской", 14, father.name, mother.name);
        HW14_Human daughter = new HW14_Human("Dasha", "Женский", 11, father.name, mother.name);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
    }

    static String[] initializeArray() throws IOException {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }
        return arr;
    }

    static void printArray(String[] arr) {
        String[] reverseArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length - i - 1] = arr[i];
        }
        // выводим элементы массива в обратном порядке
        //System.out.print(Arrays.toString(reverseArr));
        for (String arrMass : reverseArr) {
            System.out.println(arrMass + " ");
        }
    }

    static void arrStrNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[5];
        int[] arrInt = new int[5];
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = reader.readLine();
            arrInt[i] = arrStr[i].length();
        }
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
        for (String arrStr2 : arrStr) {
            System.out.println(arrStr2);
        }
        for (int arrInt2 : arrInt) {
            System.out.println(arrInt2);
        }
    }

    static void massLong() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int[] arrLong = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrLong = new int[10];
        for (int i = 0; i < arrLong.length; i++) {
            arrLong[i] = Integer.parseInt(reader.readLine());
        }
        int[] arrMinLeft = new int[arrLong.length / 2];
        int[] arrMinRight = new int[arrLong.length / 2];
        for (int i = 0; i < arrLong.length / 2; i++) {
            arrMinLeft[i] = arrLong[i];
        }
        for (int i = 0; i < arrLong.length / 2; i++) {
            arrMinRight[i] = arrLong[arrLong.length / 2 + i];
        }
        System.out.println(Arrays.toString(arrMinLeft));
        //System.out.println(Arrays.toString(arrMinRight));
        for (int arr : arrMinRight) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) throws IOException {

        /* 1 - Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей.
        Вывести объекты на экран.

        Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться
        при выводе объекта на экран.

        Пример вывода:
        Имя: Катя, пол: женский, возраст: 55
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
        ..... */
        //human();
        System.out.println("--------------------------------");

        /* 2 - В методе initializeArray(); Создать массив на 10 строчек.
        Ввести с клавиатуры 10 строчек и сохранить их в массив.
        В методе printArray(); Вывести содержимое всего массива (10 элементов)
        на экран в обратном порядке. Каждый элемент - с новой строки. */
        //initializeArray(printArray());
        //printArray(initializeArray());
        System.out.println("--------------------------------");

        /* 3 - Создать массив на 5 строк. Создать массив на 5 чисел.
        Ввести с клавиатуры 5 строк, заполнить ими массив строк.
        В каждую ячейку массива чисел записать длину строки из массива строк,
        индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки. */
        //arrStrNum();
        System.out.println("--------------------------------");

        /* 4 - Создать массив на 10 чисел. Ввести в него значения с клавиатуры.
        Создать два массива на 5 чисел каждый. Скопировать большой массив в два маленьких:
        половину чисел в первый маленький, вторую половину во второй маленький.
        Вывести второй маленький массив на экран, каждое значение выводить с новой строки. */
        massLong();
    }
}
