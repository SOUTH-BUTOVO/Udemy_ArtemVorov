package ru.Artem_Vorov.level3.lesson7.HW;

public class Mama<T> {
    private T instance;

    public T getInstance() {
        return instance;
    }

    public void setInstance(T obj) {
        this.instance = obj;
    }
}
