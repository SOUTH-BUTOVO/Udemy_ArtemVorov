package ru.Artem_Vorov.level3.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generics {

    public static void example1(List<?> list) {
    }

    public static void example2(List<? extends User> list) {
    }

    public static void example3(List<? super User> list) {
    }

    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Objects> list4 = new ArrayList<>();
        System.out.println("-----------------");

        Example1<User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("Alex", 55));
        System.out.println(example1.get()  + " Example1");
        System.out.println("-----------------");

        //Example2.simpleInit(new User());
        Example2<User> example2 = Example2.init(new User());
        example2.set(new User("Artem", 33));
        System.out.println(example2.getInstance() + " Example2");
        System.out.println("-----------------");

        List<BaseObject> list5 = new ArrayList<>();
        List<User> list6 = new ArrayList<>();
        List<ChildObject> list7 = new ArrayList<>();

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

        GenericBuilder<User> of = GenericBuilder.of(User::new);
        GenericBuilder<User> with = of.with(User::setAge, 22);
        User build = with.build();
        System.out.println("-----------------");

        User user = GenericBuilder.of(User::new)
                .with(User::setAge, 33)
                .with(User::setName, "Jhon")
                .build();
        System.out.println(user);
        System.out.println("-----------------");
    }
}
