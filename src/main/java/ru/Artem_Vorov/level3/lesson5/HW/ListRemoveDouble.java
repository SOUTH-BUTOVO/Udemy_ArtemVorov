package ru.Artem_Vorov.level3.lesson5.HW;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveDouble {
    static void fix(List<String> list) {
        //List<String> list = List.of("лира", "лоза", "роза");
        String r = "р";   // - удалять из списка строк все слова, содержащие букву «р»
        char l = 'л';   // - удваивать все слова содержащие букву «л»
        // - если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.

//        for (int i = 0; i < 1; i++) {
//            boolean index = list.contains(r);
//
//            if (index) {
//                System.out.println("Символ есть в листе");
//            } else {
//                System.out.println("Символ не найден");
//            }
//        }
//        System.out.println(list);

        List<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.contains("р") && word.contains("л")) {
                newList.add(word);
//                System.out.println ("Буква" + " (р) " +
//                        "была найдена в слове " + "(" + word + ")" + " и слово будет удалено.");
//                list.remove(word);
            }
            if (word.contains("л") && !word.contains("р")) {
                newList.add(word);
                newList.add(word);
            }

        }
        //list.clear();
        //list.addAll(newList);

        list = newList;
        System.out.println(list);
        System.out.println(newList);
    }
}
