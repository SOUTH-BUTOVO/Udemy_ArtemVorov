package ru.Artem_Vorov.level3.lesson7.HW;

import java.util.ArrayList;
import java.util.List;

public class Children<T> {
    private T instance;



    public T getInstance() {
        return instance;
    }

    public void setInstance(T obj) {
        this.instance = obj;
    }

    void child() {

        List<String> list1 = new ArrayList<>();
        list1.add("Vanya");

        List<String> list2 = new ArrayList<>();
        list2.add("Masha");
    }
}
