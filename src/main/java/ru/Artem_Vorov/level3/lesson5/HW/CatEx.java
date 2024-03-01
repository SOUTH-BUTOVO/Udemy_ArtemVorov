package ru.Artem_Vorov.level3.lesson5.HW;

public class CatEx<T> {

    private T instance;

    //private CatEx(){}

    static <T> void simpleInit(T instatiator) {}

    static <T> CatEx<T> init(T instatiator) {
        return new CatEx<T>();
    }

    public T get() {
        return instance;
    }

    public void set(T instanceO) {
        instance = instanceO;
    }
}