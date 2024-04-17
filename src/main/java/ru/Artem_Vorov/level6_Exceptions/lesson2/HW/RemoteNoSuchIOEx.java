package ru.Artem_Vorov.level6_Exceptions.lesson2.HW;

public class RemoteNoSuchIOEx {
    /* 6 Перехват checked исключений. В методе processExceptions обработайте все checked исключения.
        IOException
        RemoteException
        NoSuchFieldException
        Нужно вывести на экран каждое возникшее checked исключение. Можно использовать только один блок try. */

    void processExceptions() {
        String data = null;
        if (data == null) {
            throw new CheckedException("Тут выбрасывается множество исключений!)))");
        }
    }
}
