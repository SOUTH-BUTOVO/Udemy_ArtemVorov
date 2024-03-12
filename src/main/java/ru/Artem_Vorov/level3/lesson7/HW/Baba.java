package ru.Artem_Vorov.level3.lesson7.HW;

public class Baba<T> {
    private T instance;

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }
}
