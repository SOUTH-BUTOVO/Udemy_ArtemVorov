package ru.Artem_Vorov.level3.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class L3l2_Generics {

    public static void example1(List<?> list) {
    }

    public static void example2(List<? extends L3l2_User> list) {
    }

    public static void example3(List<? super L3l2_User> list) {
    }

    public static void main(String[] args) {
        List<L3l2_User> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Objects> list4 = new ArrayList<>();
        System.out.println("-----------------");

        L3l2_Example1<L3l2_User> example1 = new L3l2_Example1<>();
        System.out.println(example1.get());
        example1.set(new L3l2_User("Alex", 35));
        System.out.println(example1.get()  + " Example1");
        System.out.println("-----------------");

        L3l2_Example2.simpleInit(new L3l2_User());
        L3l2_Example2<L3l2_User> example2 = L3l2_Example2.init(new L3l2_User());
        example2.set(new L3l2_User("Artem", 30));
        System.out.println(example2.getInstance() + " Example2");
        System.out.println("-----------------");

        List<L3l2_BaseObject> list5 = new ArrayList<>();
        List<L3l2_User> list6 = new ArrayList<>();
        List<L3l2_ChildObject> list7 = new ArrayList<>();

        example1(list5);
        example1(list6);
        example1(list7);

        //example2(list5); Ошибка, т.к. extends не позволяет передавать дженерики Родителям.
        example2(list6);
        example2(list7);

        example3(list5);
        example3(list6);
        //example3(list7); Ошибка, т.к. super не позволяет передавать дженерики Наследникам.
        System.out.println("-----------------");

        L3l2_GenericBuilder<L3l2_User> of = L3l2_GenericBuilder.of(L3l2_User::new);
        L3l2_GenericBuilder<L3l2_User> with = of.with(L3l2_User::setAge, 22);
        L3l2_User build = with.build();
        System.out.println("-----------------");

        L3l2_User user = L3l2_GenericBuilder.of(L3l2_User::new)
                .with(L3l2_User::setAge, 33)
                .with(L3l2_User::setName, "Jhon")
                .build();
        System.out.println(user);
        System.out.println("-----------------");
    }
}
