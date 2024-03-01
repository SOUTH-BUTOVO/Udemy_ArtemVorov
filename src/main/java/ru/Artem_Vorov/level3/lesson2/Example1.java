package ru.Artem_Vorov.level3.lesson2;

public class Example1<T> {
    private T instance;

    public T get() {
        return instance;
    }

    public void set(T obj) {
        instance = obj;
    }
}
