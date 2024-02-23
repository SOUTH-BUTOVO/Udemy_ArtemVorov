package ru.Artem_Vorov.level3.lesson2;

public class L3l2_Example2<T> {
    private T instance;

    private L3l2_Example2() {
    }

    public static <T> void simpleInit(T instantiator) {
    }

    public static <T> L3l2_Example2<T> init(T instantiator) {
        return new L3l2_Example2();
    }

    public void set(T obj) {
        instance = obj;
    }

    public T getInstance() {
        return instance;
    }
}
