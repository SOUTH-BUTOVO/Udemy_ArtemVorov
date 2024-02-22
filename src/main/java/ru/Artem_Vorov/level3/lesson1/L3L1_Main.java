package ru.Artem_Vorov.level3.lesson1;

import java.util.*;

public class L3L1_Main {

    /*  - Iterable
            - Collection
                - List
                - Set
                - Queue

        - Map */
    public static void main(String[] args) {
        Object[] arr1 = new Object[5];
        arr1[0] = 1;
        arr1[1] = "2";
        arr1[2] = null;
        arr1[3] = false;
        arr1[4] = 'X';
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = new String[3];
        arr2[0] = "Hello";
        System.out.println(Arrays.toString(arr2));

        List<String> list = new ArrayList<>();
        list.add("str0");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        System.out.println("List: " + list);
        System.out.println(list.get(0));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "str");
        map.put(2, "str");
        map.put(3, "str2");
        map.put(3, "str3");
        System.out.println("Map: " + map);
    }
}
