package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 1 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int a = 42 / 0; */
        ArithmeticEx arithmeticEx = new ArithmeticEx();
        arithmeticEx.exception();
        System.out.println("1-----------------------");

        /* 2 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        String s = null;
        String m = s.toLowerCase(); */
        NullPointer nullPointerEx = new NullPointer();
        nullPointerEx.exception();
        System.out.println("2-----------------------");

        /* 3 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int[] m = new int[2];
        m[8] = 5; */
        ArrayIndex indexEx = new ArrayIndex();
        indexEx.exception();
        System.out.println("3-----------------------");

        /* 4 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        List<String> list = new ArrayList<String>();
        String s = list.get(18); */
        IndexOut indexOutEx = new IndexOut();
        indexOutEx.exception();
        System.out.println("4-----------------------");

        /* 5 Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        Map<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null); */
        NullPointerMapEx mapEx = new NullPointerMapEx();
        mapEx.exception();
        System.out.println("5-----------------------");

        /* 6 Перехват checked исключений. В методе processExceptions обработайте все checked исключения.
        IOException
        RemoteException
        NoSuchFieldException
        Нужно вывести на экран каждое возникшее checked исключение. Можно использовать только один блок try. */
        RemoteNoSuchIOEx remoteNoSuchIOEx = new RemoteNoSuchIOEx();
        //remoteNoSuchIOEx.processExceptions();
        System.out.println("6-----------------------");

        /* 7 Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
        Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и
        BufferedReader-а) этого метода в try..catch.
        Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести
        на экран все введенные числа в качестве результата. Числа выводить с новой строки сохраняя порядок ввода. */
        ReaderNum readerNum = new ReaderNum();
        readerNum.readData();
        System.out.println("7-----------------------");
    }
}
